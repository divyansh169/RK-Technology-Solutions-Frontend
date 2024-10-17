package com.divyansh.vivahsahyog;

import static java.security.AccessController.getContext;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    EditText f1;
    Button buttonRegister;
//    TextInputEditText  full_name, age, date_of_birth,city, district, address;
    TextInputEditText  date_of_birthtext;
    TextInputLayout full_name, age, date_of_birth, address, f2, f3, f4, f5;
    AutoCompleteTextView filledexpose,e1,e2 , fcfilledexpose, e3, statefilledexpose, city, district;
    public static String filledexposea,e1a,e2a , fcfilledexposea, e3a, statefilledexposea, citya, districta;
    private ProgressDialog progressDialog;
    TextInputEditText g1,g2 ,g3,g000,g00,g0;
    TextInputLayout sdet1,sdet2 ,sdet3,sdet000,sdet00,sdet0 ;
    String f1a;
    String f2a;
    String f3a;
    String f4a;
    String f5a;
    String full_namea;
    String agea;
    String date_of_birtha;
    String addressa;
    String emailpattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    private TextView textViewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Personal Details");

//        if(SharedPrefManager.getInstance(this).isLoggedIn()){
//            finish();
//            startActivity(new Intent(this, ProfileActivity.class));
//            return;
//        }
        f1 = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 =  findViewById(R.id.f3);
        f4 = findViewById(R.id.f4);
        f5 =  findViewById(R.id.f5);

        full_name = findViewById(R.id.full_name);
        age = findViewById(R.id.age);
        filledexpose = findViewById(R.id.filledexpose);
        date_of_birth = findViewById(R.id.date_of_birth);
        date_of_birthtext = findViewById(R.id.date_of_birthtext);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        fcfilledexpose = findViewById(R.id.fcfilledexpose);
        e3 = findViewById(R.id.e3);
        statefilledexpose = findViewById(R.id.statefilledexpose);
        city = findViewById(R.id.city);
        district = findViewById(R.id.district);
        address = findViewById(R.id.address);
        sdet1 = findViewById(R.id.sdet1);
        sdet2 = findViewById(R.id.sdet2);
        sdet3= findViewById(R.id.sdet3);
        sdet0 = findViewById(R.id.sdet0);
        sdet00 = findViewById(R.id.sdet00);
        sdet000= findViewById(R.id.sdet000);
        g1 = findViewById(R.id.g1);
        g2 = findViewById(R.id.g2);
        g3 = findViewById(R.id.g3);
        g0 = findViewById(R.id.g0);
        g00 = findViewById(R.id.g00);
        g000 = findViewById(R.id.g000);

        textViewLogin = (TextView) findViewById(R.id.textViewLogin);

        buttonRegister = (Button) findViewById(R.id.buttonRegister);

        progressDialog = new ProgressDialog(this);













        String[] AndhraPradesh={"Visakhapatnam", "Vijayawada", "Guntur", "Nellore", "Kurnool", "Kakinada", "Rajahmundry", "Kadapa", "Tirupati", "Anantapuram", "Vizianagaram", "Eluru", "Nandyal", "Ongole", "Adoni", "Madanapalle", "Machilipatnam", "Tenali", "Proddatur", "Chittoor", "Hindupur", "Srikakulam", "Bhimavaram", "Tadepalligudem", "Guntakal", "Dharmavaram", "Gudivada", "Narasaraopet", "Kadiri", "Tadipatri", "Mangalagin", "Chilakaluripet"};
        String[] ArunachalPradesh={"ChanglangDistrict", "DibangValleyDistrict", "EastKamengDistrict", "EastSiangDistrict", "KurungKumeyDistrict", "LohitDistrict", "LowerDibangValleyDistrict", "LowerSubansiriDistrict", "PapumPareDistrict", "TawangDistrict", "TirapDistrict", "UpperSiangDistrict", "UpperSubansiriDistrict", "WestKamengDistrict", "WestSiangDistrict"};
        String[] Assam={"Guwahat", "Silchar", "Dibrugarh", "Jorhat", "Nagaon", "Bongaigaon", "Tinsukia", "Tezpur", "Diphu", "Dhubri", "NorthLakhimpur" ,"Karimganj", "Sivasagar", "Goalpara", "BarpetaTown", "Golaghat", "Hafiong", "Mangaldai", "Tangla", "Lanka", "Hojai", "BarpetaRoad", "Kokrajhar", "Hailakandi", "Morigaon", "Nalbari", "Rangia", "Silapathar", "Dhekiajuli", "Dergaon", "Sonari", "Kharupetia", "Nazira", "Lakhipur"};
        String[] Bihar={"Patna", "Gaya", "Bhagalpur", "Purnia", "Muzafaffarpur", "Darbhanga", "BiharShaif", "Arrah", "Begusald", "Katihar", "Munger", "Chhapra", "Danapur", "Bettian", "saharsa", "Hajipur", "Sasaram" ,"Dehri", "Siwan", "Motihar", "Nawada", "Bagand", "Buxar", "Kishanganj", "Sitamarhi", "Jamalpur", "Jehanabad", "Aurangabadd"};
        String[] Chandigarh={"Chandigarhh"};
        String[] Chattisgarh={"NayaRaipur", "Raipur", "Bhilai", "Bilaaspur", "Korba", "Rajnandgaon" ,"Raiigarh", "Ambikapur", "Jagdalpur" ,"Chirmiri", "Dhamtari", "Mahasamund"};
        String[] DadraandNagarHaveli={"DadraandNagarHavelii"};
        String[] DamanandDiu={"DamanandDiuu"};
        String[] Delhi={"Delhii"};
        String[] Goa={"Bicholim" ,"Canacona" ,"Cuncolim" ,"Curchorem", "Mapusa" ,"Margao", "Mormugao", "Panaji" ,"Pernem", "Ponda", "Quepem", "Sanguem", "Sanquelim", "Valpoi"};
        String[] Gujarat={"Amdavad", "Surat", "Vadodara" ,"Rajkot" ,"Bhavnagar", "Jamnagar", "Gandhinagar" ,"Junagadh", "Gandhidham", "Anand", "Navsari" ,"Morbi", "Nadiad", "Surendranagar", "Bharuch", "Mehsana" ,"Bhuj", "Porbandar","Palanpur", "Valsad","Vapi","Gondal" ,"Veraval" ,"Godhra" ,"Patan" ,"Kalol" ,"Dahod", "Botad", "Amreli", "Deesa", "Jetpur"};
        String[] Haryana={"Faridabad" ,"Gurugram" ,"Panipat" ,"Ambala" ,"Yamunanagar" ,"Rohtak" ,"Hisar" ,"Karnal" ,"Sonipat" ,"Panchkula" ,"Bhiwani", "Sirsa", "Bahadurgarn" ,"Jind", "Thanesar" ,"Kaithal" ,"Rewari" ,"Narnaul" ,"Pundri", "Kosli", "Palwal"};
        String[] HimachalPradesh={"Shimla", "Dharamsala", "Solan", "Mandi", "Palampur", "Baddi", "Nahan", "PaontaSahib", "Sundanagar", "Chamba", "Una", "Kullu" ,"Hamirpur", "Bilaspur", "YolCantonment", "Nalagarh", "Nurpur", "Kangra", "Santokhgarh", "MehatpurBasdehra" ,"Shamshi", "Parwanoo", "Manali", "TiraSujanpur", "Ghumarwin", "Dalhousie", "Rohru", "NagrotaBagwan", "Raampur", "Jawalamukhi", "Jogindernagar", "DeraGopipur", "Sarkaghat", "Jhakhri", "Indora", "Bhuntar", "Nadaun", "Theog", "KasauliCantonment", "Gagret", "ChuariKhas", "Daulatpur", "SabathuCantonment", "DalhousieCantonment", "Raigarh", "Arki", "DagshaiCantonment", "Seoni", "Talai", "JutoghCantonment", "Chaupal", "Rewalsar", "BaklohCantonment", "Jubbal", "Bhota", "Banjar", "NainaDevi", "Kotkhai", "Narkanda"};
        String[] JammuandKashmir={"Srinagar", "Jammu", "Anantnag"};
        String[] Jharkhand={"Jamshedpur" ,"Dhanbad", "Ranchi", "BokaroSteelCity", "Deoghar" ,"Phusro" ,"Hazaribagh", "Giridih", "Ramgarh", "Medininagar", "Chirkunda"};
        String[] Karnataka={"Bangalore", "HubliDharwad", "Mysore", "Gulbarga", "Mangalore", "Belgaum", "Davanagere", "Bellary", "Bijapur", "Shimoga", "Tumkur", "Raichur" ,"Bidar" ,"Hospet" ,"GadagBetageri" ,"Robertsonpet" ,"Hassan" ,"Bhadravati" ,"Chitradurga", "Udupi", "Kolar", "Mandya", "Chikmagalur", "Gangavati", "Bagalkot", "Ranebennuru"};
        String[] Kerala={"Thiruvananthapuram","Kozhikode","Kochi","Kollam","Thrissur","Kannur","Alappuzha","Kottayam","Palakkad","Manjeri","Thalassery","Ponnani","Vatakara","Kanhangad","Payyanur","Koyilandy","Parappanangadi","Kalamassery","Neyyattinkara","Tanur","Thrippunithura","Kayamkulam","Malappuram","Thrikkakkara","Wadakkancherry","Nedumangad","Kondotty","Tirurangad","irur","Panoor","Nileshwaram","Kasaragod","Feroke","KunnamkUlam","Ottappalam","Tiruvalla","Thodupuzha","Perinthalmanna","Chalakudy","Payyoll","Koduvally","Mananthavady","Changanassery","Mattanur","Punalur","Nilambur","Cherthala","SultanBathery","Maradu","Kottakkal","Taliparamba","Shornur","ndalam","Kattappana","Mukkam","ty","chery","Varkala","Cherpulassery","Chavakkad","Kothamangalam","Pathanamthitta","Atingal","aravur","Ramanattukara","Mannarkkad","rattupetta","Kodungallur","Sreekandapuram","Anganiauy","Chittur","Thathamangalam","Kalpetta","NorthParavur","Haripad","Muvattupuzha","Kottarakara","Kuthuparamba","Adoor","Piravom","Irinjalakuda","Pattambi","Anthoor","Perumbavoor","Ettumanoor","Mavelikkara","Karunagappalli","Eloor","Chengannur","Vaikom","Aluva","Pala","Guruvayur","Koothattukulam","Avinissery"};
        String[] Ladakh={"Ladakhh"};
        String[] MadhyaPradesh={"Indore","Bhopal","Jabalpur","Gwalior","Katni","Ujjain","Dewas","Satna","Ratlam","Rewa","Sagar","Singrauli","Burhanpur","Khandwa","Bhind","Chhindwara","Guna","Shivpuri","Vidisha","Chhatarpur","Damoh","Mandsaur","Khargone","Neemuch","Pithampur","Narmadapuram","Itarsi","Sehore","Morena","Betul","Seonii","Datia","Nagda","Dindori"};
        String[] Maharashtra = {"Mumbai","Pune","Nagpur","Thane","PCMCPune","Nashik","KalyanDombivli","VasaiVirarCityMC","Aurangabad","NaviMumbai","Solapur","MiraBhayandar","BhiwandiNizampurMC","Jalgaon","Amravati","Nanded","Kolhapur","Ulhasnagar","SangliMirajKupwad","Malegaon","Akola","Latur","Dhule","Ahmednagar","Chandrapur","Parbhani","Ichalkaranji","Jalna","Ambarnath","Bhusawal","Panvel","Badlapur","Beed","Gondia","Satara","Barshi","Yavatmal","Achalpur","Osmanabad","Nandurbar","Wardha","Udgir","Hinganghat"};
        String[] Manipur={"Bishnupur","Thoubal","ImphalEast","ImphalWest","Senapati","Ukhrul","Chandel","Churachandpur","Tamenglong","Jiribam","Kangpokpi","Kakching","Tengnoupal","Kamjong","Noney","Pherzawi"};
        String[] Meghalaya={"Meghalayaa"};
        String[] Mizoram={"Aizawl","Kolasib","Lawngtlai","Lunglei","Mamit","Saiha","Serchhip","Champhai","Hnahthial","Khawzawl","Saitual"};
        String[] Nagaland={"Dimapur","Kiphire","Kohima","Longleng","Mokokchung","Mon","Peren","Phek","Tuensang","Wokha","Zunhebote"};
        String[] Odisha={"Bhubaneswar","Cuttack","Rourkela","Berhampur","Sambalpur","Puri","Balasore","Bhadrak","Baripada"};
        String[] Puducherry={"Puducherryy"};
        String[] Punjab={"Ludhiana", "Amritsar", "Jalandhar", "Patiala", "Bathinda", "Mohali", "Firozpur", "Batala", "Pathankot", "Moga", "Abohar", "Malerkotla", "Khanna", "Phagwara", "Muktsar", "Barnala", "Rajpura", "Hoshiarpur", "Kapurthala", "Faridkot", "Sunam"};
        String[] Rajasthan={"Jaipur","Jodhpur","Kota ","Bhiwadi","Bikaner","Udaipur","Ajmer","Bhilwara","Alwar","Sikar","Bharatpur","Pali","SriGanganagar","Kishangarh","Baran","Dhaulpur","Tonk","Beawar","Hanumangarh"};
        String[] Sikkim={"Gangtok","Mangan","Namchi","Gyalshing","Pakyong","Soreng"};
        String[] TamilNadu={"Chennai","Coimbatore","Madural","Tiruchirappalli","Salem","Tirunelveli","Tiruppur","Vellore","Erode","Thoothukkudi","Dindigul","Thanjavur","Ranipet","Sivakasi","Karur","Udhagamandalam","Hosur","Nagercoil","Kanchipuram","Kumarapalayam","Karaikkudi","Neyveli","Cuddalore","Kumbakonam","Tiruvannamalai","Pollachi","Rajapalayam","Gudiyatham","Pudukkottai","Vaniyambadi","Ambur","Nagapattinam"};
        String[] Telangana={"Hyderabad","Warangala","Nizamabad","Khammam","Karimnagar","Ramagundam","Mahabubnagar","Nalgonda","Adilabad","Suryapet ","Siddipet","Miryalaguda","Jagtial","Mancherial","Nimal","Sircilla","Kamareddy","Palwancha","Kothagudem","Bodhan","Sangareddy","Metpally","Zahirabad","MeerpetJillelguda","Korutla","Tandur","Badangpet","Kodad","Armur","Gadwal","Wanaparthy","Kagaznagar","Bellampalle","KhanapuramHaveli","Bhuvanagiri","Vikarabad","Jangaon","Mandamam","Peerzadiguda","Bhadrachalam","Bhainsa","Boduppal","Jawaharnagar","Medak","Shamshabad","Mahabubabad","Bhupalpally","Narayanpet","Peddapaill","Dundigal","Huzumagar","Medchal","BandlagudaJagir","Kyathanpally","Manuguru","Naspur","Narsampet","Devarakonda","Dubbaka","Nakrekal","Banswada","Kalwakurthy","NagarKurnool","Parigi","Thumkunta","Neredcherla","Nagaram","Gajwel","Chennur","Asifabad","Madhira","Ghatkesar","Kompally","Dasnapur","Sarapaka","Husnabad","Pocharam","Dammaiguda","Achampet"};
        String[] Tripura={"Agartala","Dharmanagar","Udaipurr","Kailashahar","Bishalgarh","Teliamura","Khowai","Belonia","Melaghar","Mohanpur","Ambassa","Ranirbazar","Santirbazar","Kumarghat","Sonamura","Panisagar","Amarpur","Jirania","Kamalpur","Sabroom"};
        String[] UttarPradesh = {"Mathura", "Agra", "Aligarh", "Kanpur", "Lucknow", "Ghaziabad", "Meerut", "Varanasi", "Prayagraj", "Bareilly", "Moradabad", "Saharanpur", "Gorakhpur", "Noida", "Firozabad", "Jhansi", "Muzaffarnagar", "Goverdhan", "Vrindavan", "Budaun", "Rampur", "Shahjahanpur", "FarrukhabadcumFategarh", "FaizabadandAyodhya", "MaunathBhanjan", "Hapur", "Ayodhya", "Etawah", "MirzapurcumVindhyachal", "Bulandshahr", "Sambhal", "Amroha", "Hardoi", "Fatehpur", "Raebareli", "Orai", "Sitapur", "Bahraich", "Modinagar", "Unnao", "Jaunpur", "Lakhimpur","Hathras", "Banda", "Pilibhit", "Barabanki", "Khurja", "Gonda", "Mainpuri", "Lalitpur", "Etah", "Deoria", "Ujhani", "Ghazipur", "Sultanpur", "Azamgarh", "Bijnor", "Sahaswan", "Basti", "Chandausi", "Akbarpur", "Ballia", "Tanda", "GreaterNoida", "Shikohabad", "Shamli", "Awagarh", "Kasganj"};
        String[] Uttarakhand={"Dehradun","Haridwar","Roorkee","HaldwanicumKathgodamNainital","Rudrapur","Kashipur","Rishikesh"};
        String[] WestBengal={"Kolkata","Asansol","Siliguri","Durgapur","Bardhaman","Malda","Baharampur","Habra","Kharagpur","Shantipur","Dankuni","Dhulian","Ranaghat","Haldia","Raiganj","Krishnanagar","Nabadwip","Medinipur","Jalpaiguri","Balurghat","Basirhat","Bankura","Chakdaha","Darjeeling","Alipurduar","Purulia","Jangipur","Bolpur","Bangaon","CoochBehar"};



    String[] Mumbai = {"Churchgate", "Marine Lines", "Charni Road", "Grant Road", "Mumbai Central", "Mahalakshmi", "Lower Parel", "Prabhadevi",
            "Dadar", "Matunga", "Mahim", "Bandra", "Khar", "Santacruz", "Vile Parle", "Andheri", "Jogeshwari", "Ram Mandir",
            "Goregaon", "Malad", "Kandivai", "Borivali", "Dahisar", "MiraRoad", "Bhayander", "Naigaon", "Vasai Road", "Nalla Sopara", "Virar"};
    String[] Pune = {"Hinjewadi", "Wagholi", " Ambegaon", "Undri", "Katraj"};
    String[] Aurangabad = {"Aarif Colony", "Baiji Pura", "Balaji Nagar", "Angoori Bagh"};
    String[] Mathura={"Khandelwal Mega Mart", "VLN Whole Sale", "Mast Banarasi Paan"};
    String[] Aligarh={"Agnovad","Akoti","Amroli","Athwalines"};
    String[] Agra={"Kalawad Road","Astron chowk","Kotecha chowk","Trikon bag"};
    String[] Visakhapatnam={"Visakhapatnam"};
    String[] Vijayawada={"Vijayawada"};
    String[] Guntur={"Guntur"};
    String[] Nellore={"Nellore"};
    String[] Kurnool={"Kurnool"};
    String[] Kakinada={"Kakinada"};
    String[] Rajahmundry={"Rajahmundry"};
    String[] Kadapa={"Kadapa"};
    String[] Tirupati={"Tirupati"};
    String[] Anantapuram={"Anantapuram"};
    String[] Vizianagaram={"Vizianagaram"};
    String[] Eluru={"Eluru"};
    String[] Nandyal={"Nandyal"};
    String[] Ongole={"Ongole"};
    String[] Adoni={"Adoni"};
    String[] Madanapalle={"Madanapalle"};
    String[] Machilipatnam={"Machilipatnam"};
    String[] Tenali={"Tenali"};
    String[] Proddatur={"Proddatur"};
    String[] Chittoor={"Chittoor"};
    String[] Hindupur={"Hindupur"};
    String[] Srikakulam={"Srikakulam"};
    String[] Bhimavaram={"Bhimavaram"};
    String[] Tadepalligudem={"Tadepalligudem"};
    String[] Guntakal={"Guntakal"};
    String[] Dharmavaram={"Dharmavaram"};
    String[] Gudivada={"Gudivada"};
    String[] Narasaraopet={"Narasaraopet"};
    String[] Kadiri={"Kadiri"};
    String[] Tadipatri={"Tadipatri"};
    String[] Mangalagin={"Mangalagin"};
    String[] Chilakaluripet={"Chilakaluripet"};
    String[] ChanglangDistrict={"ChanglangDistrict"};
    String[] DibangValleyDistrict={"DibangValleyDistrict"};
    String[] EastKamengDistrict={"EastKamengDistrict"};
    String[] EastSiangDistrict={"EastSiangDistrict"};
    String[] KurungKumeyDistrict={"KurungKumeyDistrict"};
    String[] LohitDistrict={"LohitDistrict"};
    String[] LowerDibangValleyDistrict={"LowerDibangValleyDistrict"};
    String[] LowerSubansiriDistrict={"LowerSubansiriDistrict"};
    String[] PapumPareDistrict={"PapumPareDistrict"};
    String[] TawangDistrict={"TawangDistrict"};
    String[] TirapDistrict={"TirapDistrict"};
    String[] UpperSiangDistrict={"UpperSiangDistrict"};
    String[] UpperSubansiriDistrict={"UpperSubansiriDistrict"};
    String[] WestKamengDistrict={"WestKamengDistrict"};
    String[] WestSiangDistrict={"WestSiangDistrict"};
    String[] Guwahat={"Guwahat"};
    String[] Silchar={"Silchar"};
    String[] Dibrugarh={"Dibrugarh"};
    String[] Jorhat={"Jorhat"};
    String[] Nagaon={"Nagaon"};
    String[] Bongaigaon={"Bongaigaon"};
    String[] Tinsukia={"Tinsukia"};
    String[] Tezpur={"Tezpur"};
    String[] Diphu={"Diphu"};
    String[] Dhubri={"Dhubri"};
    String[] NorthLakhimpur={"NorthLakhimpur"};
    String[] Karimganj={"Karimganj"};
    String[] Sivasagar={"Sivasagar"};
    String[] Goalpara={"Goalpara"};
    String[] BarpetaTown={"BarpetaTown"};
    String[] Golaghat={"Golaghat"};
    String[] Hafiong={"Hafiong"};
    String[] Mangaldai={"Mangaldai"};
    String[] Tangla={"Tangla"};
    String[] Lanka={"Lanka"};
    String[] Hojai={"Hojai"};
    String[] BarpetaRoad={"BarpetaRoad"};
    String[] Kokrajhar={"Kokrajhar"};
    String[] Hailakandi={"Hailakandi"};
    String[] Morigaon={"Morigaon"};
    String[] Nalbari={"Nalbari"};
    String[] Rangia={"Rangia"};
    String[] Silapathar={"Silapathar"};
    String[] Dhekiajuli={"Dhekiajuli"};
    String[] Dergaon={"Dergaon"};
    String[] Sonari={"Sonari"};
    String[] Kharupetia={"Kharupetia"};
    String[] Nazira={"Nazira"};
    String[] Lakhipur={"Lakhipur"};
    String[] Patna={"Patna"};
    String[] Gaya={"Gaya"};
    String[] Bhagalpur={"Bhagalpur"};
    String[] Purnia={"Purnia"};
    String[] Muzafaffarpur={"Muzafaffarpur"};
    String[] Darbhanga={"Darbhanga"};
    String[] BiharShaif={"BiharShaif"};
    String[] Arrah={"Arrah"};
    String[] Begusald={"Begusald"};
    String[] Katihar={"Katihar"};
    String[] Munger={"Munger"};
    String[] Chhapra={"Chhapra"};
    String[] Danapur={"Danapur"};
    String[] Bettian={"Bettian"};
    String[] saharsa={"saharsa"};
    String[] Hajipur={"Hajipur"};
    String[] Sasaram={"Sasaram"};
    String[] Dehri={"Dehri"};
    String[] Siwan={"Siwan"};
    String[] Motihar={"Motihar"};
    String[] Nawada={"Nawada"};
    String[] Bagand={"Bagand"};
    String[] Buxar={"Buxar"};
    String[] Kishanganj={"Kishanganj"};
    String[] Sitamarhi={"Sitamarhi"};
    String[] Jamalpur={"Jamalpur"};
    String[] Jehanabad={"Jehanabad"};
    String[] Chandigarhh={"Chandigarh"};
    String[] NayaRaipur={"NayaRaipur"};
    String[] Raipur={"Raipur"};
    String[] Bhilai={"Bhilai"};
    String[] Bilaspur={"Bilaspur"};
    String[] Korba={"Korba"};
    String[] Rajnandgaon={"Rajnandgaon"};
    String[] Raigarh={"Raigarh"};
    String[] Ambikapur={"Ambikapur"};
    String[] Jagdalpur={"Jagdalpur"};
    String[] Chirmiri={"Chirmiri"};
    String[] Dhamtari={"Dhamtari"};
    String[] Mahasamund={"Mahasamund"};
    String[] DadraandNagarHavelii={"DadraandNagarHaveli"};
    String[] DamanandDiuu={"DamanandDiu"};
    String[] Delhii={"Delhi"};
    String[] Bicholim={"Bicholim"};
    String[] Canacona={"Canacona"};
    String[] Cuncolim={"Cuncolim"};
    String[] Curchorem={"Curchorem"};
    String[] Mapusa={"Mapusa"};
    String[] Margao={"Margao"};
    String[] Mormugao={"Mormugao"};
    String[] Panaji={"Panaji"};
    String[] Pernem={"Pernem"};
    String[] Ponda={"Ponda"};
    String[] Quepem={"Quepem"};
    String[] Sanguem={"Sanguem"};
    String[] Sanquelim={"Sanquelim"};
    String[] Valpoi={"Valpoi"};
    String[] Amdavad={"Amdavad"};
    String[] Surat={"Surat"};
    String[] Vadodara={"Vadodara"};
    String[] Rajkot={"Rajkot"};
    String[] Bhavnagar={"Bhavnagar"};
    String[] Jamnagar={"Jamnagar"};
    String[] Gandhinagar={"Gandhinagar"};
    String[] Junagadh={"Junagadh"};
    String[] Gandhidham={"Gandhidham"};
    String[] Anand={"Anand"};
    String[] Navsari={"Navsari"};
    String[] Morbi={"Morbi"};
    String[] Nadiad={"Nadiad"};
    String[] Surendranagar={"Surendranagar"};
    String[] Bharuch={"Bharuch"};
    String[] Mehsana={"Mehsana"};
    String[] Bhuj={"Bhuj"};
    String[] Porbandar={"Porbandar"};
    String[] Palanpur={"Palanpur"};
    String[] Valsad={"Valsad"};
    String[] Vapi={"Vapi"};
    String[] Gondal={"Gondal"};
    String[] Veraval={"Veraval"};
    String[] Godhra={"Godhra"};
    String[] Patan={"Patan"};
    String[] Kalol={"Kalol"};
    String[] Dahod={"Dahod"};
    String[] Botad={"Botad"};
    String[] Amreli={"Amreli"};
    String[] Deesa={"Deesa"};
    String[] Jetpur={"Jetpur"};
    String[] Faridabad={"Faridabad"};
    String[] Gurugram={"Gurugram"};
    String[] Panipat={"Panipat"};
    String[] Ambala={"Ambala"};
    String[] Yamunanagar={"Yamunanagar"};
    String[] Rohtak={"Rohtak"};
    String[] Hisar={"Hisar"};
    String[] Karnal={"Karnal"};
    String[] Sonipat={"Sonipat"};
    String[] Panchkula={"Panchkula"};
    String[] Bhiwani={"Bhiwani"};
    String[] Sirsa={"Sirsa"};
    String[] Bahadurgarn={"Bahadurgarn"};
    String[] Jind={"Jind"};
    String[] Thanesar={"Thanesar"};
    String[] Kaithal={"Kaithal"};
    String[] Rewari={"Rewari"};
    String[] Narnaul={"Narnaul"};
    String[] Pundri={"Pundri"};
    String[] Kosli={"Kosli"};
    String[] Palwal={"Palwal"};
    String[] Shimla={"Shimla"};
    String[] Dharamsala={"Dharamsala"};
    String[] Solan={"Solan"};
    String[] Mandi={"Mandi"};
    String[] Palampur={"Palampur"};
    String[] Baddi={"Baddi"};
    String[] Nahan={"Nahan"};
    String[] PaontaSahib={"PaontaSahib"};
    String[] Sundanagar={"Sundanagar"};
    String[] Chamba={"Chamba"};
    String[] Una={"Una"};
    String[] Kullu={"Kullu"};
    String[] Hamirpur={"Hamirpur"};
    String[] Bilaaspur={"Bilaspur"};
    String[] YolCantonment={"YolCantonment"};
    String[] Nalagarh={"Nalagarh"};
    String[] Nurpur={"Nurpur"};
    String[] Kangra={"Kangra"};
    String[] Santokhgarh={"Santokhgarh"};
    String[] MehatpurBasdehra={"MehatpurBasdehra"};
    String[] Shamshi={"Shamshi"};
    String[] Parwanoo={"Parwanoo"};
    String[] Manali={"Manali"};
    String[] TiraSujanpur={"TiraSujanpur"};
    String[] Ghumarwin={"Ghumarwin"};
    String[] Dalhousie={"Dalhousie"};
    String[] Rohru={"Rohru"};
    String[] NagrotaBagwan={"NagrotaBagwan"};
    String[] Rampur={"Rampur"};
    String[] Jawalamukhi={"Jawalamukhi"};
    String[] Jogindernagar={"Jogindernagar"};
    String[] DeraGopipur={"DeraGopipur"};
    String[] Sarkaghat={"Sarkaghat"};
    String[] Jhakhri={"Jhakhri"};
    String[] Indora={"Indora"};
    String[] Bhuntar={"Bhuntar"};
    String[] Nadaun={"Nadaun"};
    String[] Theog={"Theog"};
    String[] KasauliCantonment={"KasauliCantonment"};
    String[] Gagret={"Gagret"};
    String[] ChuariKhas={"ChuariKhas"};
    String[] Daulatpur={"Daulatpur"};
    String[] SabathuCantonment={"SabathuCantonment"};
    String[] DalhousieCantonment={"DalhousieCantonment"};
    String[] Raiigarh={"Raigarh"};
    String[] Arki={"Arki"};
    String[] DagshaiCantonment={"DagshaiCantonment"};
    String[] Seoni={"Seoni"};
    String[] Talai={"Talai"};
    String[] JutoghCantonment={"JutoghCantonment"};
    String[] Chaupal={"Chaupal"};
    String[] Rewalsar={"Rewalsar"};
    String[] BaklohCantonment={"BaklohCantonment"};
    String[] Jubbal={"Jubbal"};
    String[] Bhota={"Bhota"};
    String[] Banjar={"Banjar"};
    String[] NainaDevi={"NainaDevi"};
    String[] Kotkhai={"Kotkhai"};
    String[] Narkanda={"Narkanda"};
    String[] Srinagar={"Srinagar"};
    String[] Jammu={"Jammu"};
    String[] Anantnag={"Anantnag"};
    String[] Jamshedpur={"Jamshedpur"};
    String[] Dhanbad={"Dhanbad"};
    String[] Ranchi={"Ranchi"};
    String[] BokaroSteelCity={"BokaroSteelCity"};
    String[] Deoghar={"Deoghar"};
    String[] Phusro={"Phusro"};
    String[] Hazaribagh={"Hazaribagh"};
    String[] Giridih={"Giridih"};
    String[] Ramgarh={"Ramgarh"};
    String[] Medininagar={"Medininagar"};
    String[] Chirkunda={"Chirkunda"};
    String[] Bangalore={"Bangalore"};
    String[] HubliDharwad={"HubliDharwad"};
    String[] Mysore={"Mysore"};
    String[] Gulbarga={"Gulbarga"};
    String[] Mangalore={"Mangalore"};
    String[] Belgaum={"Belgaum"};
    String[] Davanagere={"Davanagere"};
    String[] Bellary={"Bellary"};
    String[] Bijapur={"Bijapur"};
    String[] Shimoga={"Shimoga"};
    String[] Tumkur={"Tumkur"};
    String[] Raichur={"Raichur"};
    String[] Bidar={"Bidar"};
    String[] Hospet={"Hospet"};
    String[] GadagBetageri={"GadagBetageri"};
    String[] Robertsonpet={"Robertsonpet"};
    String[] Hassan={"Hassan"};
    String[] Bhadravati={"Bhadravati"};
    String[] Chitradurga={"Chitradurga"};
    String[] Udupi={"Udupi"};
    String[] Kolar={"Kolar"};
    String[] Mandya={"Mandya"};
    String[] Chikmagalur={"Chikmagalur"};
    String[] Gangavati={"Gangavati"};
    String[] Bagalkot={"Bagalkot"};
    String[] Ranebennuru={"Ranebennuru"};
    String[] Thiruvananthapuram={"Thiruvananthapuram"};
    String[] Kozhikode={"Kozhikode"};
    String[] Kochi={"Kochi"};
    String[] Kollam={"Kollam"};
    String[] Thrissur={"Thrissur"};
    String[] Kannur={"Kannur"};
    String[] Alappuzha={"Alappuzha"};
    String[] Kottayam={"Kottayam"};
    String[] Palakkad={"Palakkad"};
    String[] Manjeri={"Manjeri"};
    String[] Thalassery={"Thalassery"};
    String[] Ponnani={"Ponnani"};
    String[] Vatakara={"Vatakara"};
    String[] Kanhangad={"Kanhangad"};
    String[] Payyanur={"Payyanur"};
    String[] Koyilandy={"Koyilandy"};
    String[] Parappanangadi={"Parappanangadi"};
    String[] Kalamassery={"Kalamassery"};
    String[] Neyyattinkara={"Neyyattinkara"};
    String[] Tanur={"Tanur"};
    String[] Thrippunithura={"Thrippunithura"};
    String[] Kayamkulam={"Kayamkulam"};
    String[] Malappuram={"Malappuram"};
    String[] Thrikkakkara={"Thrikkakkara"};
    String[] Wadakkancherry={"Wadakkancherry"};
    String[] Nedumangad={"Nedumangad"};
    String[] Kondotty={"Kondotty"};
    String[] Tirurangad={"Tirurangad"};
    String[] irur={"irur"};
    String[] Panoor={"Panoor"};
    String[] Nileshwaram={"Nileshwaram"};
    String[] Kasaragod={"Kasaragod"};
    String[] Feroke={"Feroke"};
    String[] KunnamkUlam={"KunnamkUlam"};
    String[] Ottappalam={"Ottappalam"};
    String[] Tiruvalla={"Tiruvalla"};
    String[] Thodupuzha={"Thodupuzha"};
    String[] Perinthalmanna={"Perinthalmanna"};
    String[] Chalakudy={"Chalakudy"};
    String[] Payyoll={"Payyoll"};
    String[] Koduvally={"Koduvally"};
    String[] Mananthavady={"Mananthavady"};
    String[] Changanassery={"Changanassery"};
    String[] Mattanur={"Mattanur"};
    String[] Punalur={"Punalur"};
    String[] Nilambur={"Nilambur"};
    String[] Cherthala={"Cherthala"};
    String[] SultanBathery={"SultanBathery"};
    String[] Maradu={"Maradu"};
    String[] Kottakkal={"Kottakkal"};
    String[] Taliparamba={"Taliparamba"};
    String[] Shornur={"Shornur"};
    String[] ndalam={"ndalam"};
    String[] Kattappana={"Kattappana"};
    String[] Mukkam={"Mukkam"};
    String[] ty={"ty"};
    String[] chery={"chery"};
    String[] Varkala={"Varkala"};
    String[] Cherpulassery={"Cherpulassery"};
    String[] Chavakkad={"Chavakkad"};
    String[] Kothamangalam={"Kothamangalam"};
    String[] Pathanamthitta={"Pathanamthitta"};
    String[] Atingal={"Atingal"};
    String[] aravur={"aravur"};
    String[] Ramanattukara={"Ramanattukara"};
    String[] Mannarkkad={"Mannarkkad"};
    String[] rattupetta={"rattupetta"};
    String[] Kodungallur={"Kodungallur"};
    String[] Sreekandapuram={"Sreekandapuram"};
    String[] Anganiauy={"Anganiauy"};
    String[] Chittur={"Chittur"};
    String[] Thathamangalam={"Thathamangalam"};
    String[] Kalpetta={"Kalpetta"};
    String[] NorthParavur={"NorthParavur"};
    String[] Haripad={"Haripad"};
    String[] Muvattupuzha={"Muvattupuzha"};
    String[] Kottarakara={"Kottarakara"};
    String[] Kuthuparamba={"Kuthuparamba"};
    String[] Adoor={"Adoor"};
    String[] Piravom={"Piravom"};
    String[] Irinjalakuda={"Irinjalakuda"};
    String[] Pattambi={"Pattambi"};
    String[] Anthoor={"Anthoor"};
    String[] Perumbavoor={"Perumbavoor"};
    String[] Ettumanoor={"Ettumanoor"};
    String[] Mavelikkara={"Mavelikkara"};
    String[] Karunagappalli={"Karunagappalli"};
    String[] Eloor={"Eloor"};
    String[] Chengannur={"Chengannur"};
    String[] Vaikom={"Vaikom"};
    String[] Aluva={"Aluva"};
    String[] Pala={"Pala"};
    String[] Guruvayur={"Guruvayur"};
    String[] Koothattukulam={"Koothattukulam"};
    String[] Avinissery={"Avinissery"};
    String[] Ladakhh={"Ladakh"};
    String[] Indore={"Indore"};
    String[] Bhopal={"Bhopal"};
    String[] Jabalpur={"Jabalpur"};
    String[] Gwalior={"Gwalior"};
    String[] Katni={"Katni"};
    String[] Ujjain={"Ujjain"};
    String[] Dewas={"Dewas"};
    String[] Satna={"Satna"};
    String[] Ratlam={"Ratlam"};
    String[] Rewa={"Rewa"};
    String[] Sagar={"Sagar"};
    String[] Singrauli={"Singrauli"};
    String[] Burhanpur={"Burhanpur"};
    String[] Khandwa={"Khandwa"};
    String[] Bhind={"Bhind"};
    String[] Chhindwara={"Chhindwara"};
    String[] Guna={"Guna"};
    String[] Shivpuri={"Shivpuri"};
    String[] Vidisha={"Vidisha"};
    String[] Chhatarpur={"Chhatarpur"};
    String[] Damoh={"Damoh"};
    String[] Mandsaur={"Mandsaur"};
    String[] Khargone={"Khargone"};
    String[] Neemuch={"Neemuch"};
    String[] Pithampur={"Pithampur"};
    String[] Narmadapuram={"Narmadapuram"};
    String[] Itarsi={"Itarsi"};
    String[] Sehore={"Sehore"};
    String[] Morena={"Morena"};
    String[] Betul={"Betul"};
    String[] Seonii={"Seoni"};
    String[] Datia={"Datia"};
    String[] Nagda={"Nagda"};
    String[] Dindori={"Dindori"};
    String[] Nagpur={"Nagpur"};
    String[] Thane={"Thane"};
    String[] PCMCPune={"PCMCPune"};
    String[] Nashik={"Nashik"};
    String[] KalyanDombivli={"KalyanDombivli"};
    String[] VasaiVirarCityMC={"VasaiVirarCityMC"};
    String[] Aurangabadd={"Aurangabad"};
    String[] NaviMumbai={"NaviMumbai"};
    String[] Solapur={"Solapur"};
    String[] MiraBhayandar={"MiraBhayandar"};
    String[] BhiwandiNizampurMC={"BhiwandiNizampurMC"};
    String[] Jalgaon={"Jalgaon"};
    String[] Amravati={"Amravati"};
    String[] Nanded={"Nanded"};
    String[] Kolhapur={"Kolhapur"};
    String[] Ulhasnagar={"Ulhasnagar"};
    String[] SangliMirajKupwad={"SangliMirajKupwad"};
    String[] Malegaon={"Malegaon"};
    String[] Akola={"Akola"};
    String[] Latur={"Latur"};
    String[] Dhule={"Dhule"};
    String[] Ahmednagar={"Ahmednagar"};
    String[] Chandrapur={"Chandrapur"};
    String[] Parbhani={"Parbhani"};
    String[] Ichalkaranji={"Ichalkaranji"};
    String[] Jalna={"Jalna"};
    String[] Ambarnath={"Ambarnath"};
    String[] Bhusawal={"Bhusawal"};
    String[] Panvel={"Panvel"};
    String[] Badlapur={"Badlapur"};
    String[] Beed={"Beed"};
    String[] Gondia={"Gondia"};
    String[] Satara={"Satara"};
    String[] Barshi={"Barshi"};
    String[] Yavatmal={"Yavatmal"};
    String[] Achalpur={"Achalpur"};
    String[] Osmanabad={"Osmanabad"};
    String[] Nandurbar={"Nandurbar"};
    String[] Wardha={"Wardha"};
    String[] Udgir={"Udgir"};
    String[] Hinganghat={"Hinganghat"};
    String[] Bishnupur={"Bishnupur"};
    String[] Thoubal={"Thoubal"};
    String[] ImphalEast={"ImphalEast"};
    String[] ImphalWest={"ImphalWest"};
    String[] Senapati={"Senapati"};
    String[] Ukhrul={"Ukhrul"};
    String[] Chandel={"Chandel"};
    String[] Churachandpur={"Churachandpur"};
    String[] Tamenglong={"Tamenglong"};
    String[] Jiribam={"Jiribam"};
    String[] Kangpokpi={"Kangpokpi"};
    String[] Kakching={"Kakching"};
    String[] Tengnoupal={"Tengnoupal"};
    String[] Kamjong={"Kamjong"};
    String[] Noney={"Noney"};
    String[] Pherzawi={"Pherzawi"};
    String[] Meghalayaa={"Meghalaya"};
    String[] Aizawl={"Aizawl"};
    String[] Kolasib={"Kolasib"};
    String[] Lawngtlai={"Lawngtlai"};
    String[] Lunglei={"Lunglei"};
    String[] Mamit={"Mamit"};
    String[] Saiha={"Saiha"};
    String[] Serchhip={"Serchhip"};
    String[] Champhai={"Champhai"};
    String[] Hnahthial={"Hnahthial"};
    String[] Khawzawl={"Khawzawl"};
    String[] Saitual={"Saitual"};
    String[] Dimapur={"Dimapur"};
    String[] Kiphire={"Kiphire"};
    String[] Kohima={"Kohima"};
    String[] Longleng={"Longleng"};
    String[] Mokokchung={"Mokokchung"};
    String[] Mon={"Mon"};
    String[] Peren={"Peren"};
    String[] Phek={"Phek"};
    String[] Tuensang={"Tuensang"};
    String[] Wokha={"Wokha"};
    String[] Zunhebote={"Zunhebote"};
    String[] Bhubaneswar={"Bhubaneswar"};
    String[] Cuttack={"Cuttack"};
    String[] Rourkela={"Rourkela"};
    String[] Berhampur={"Berhampur"};
    String[] Sambalpur={"Sambalpur"};
    String[] Puri={"Puri"};
    String[] Balasore={"Balasore"};
    String[] Bhadrak={"Bhadrak"};
    String[] Baripada={"Baripada"};
    String[] Puducherryy={"Puducherry"};
    String[] Ludhiana={"Ludhiana"};
    String[] Amritsar={"Amritsar"};
    String[] Jalandhar={"Jalandhar"};
    String[] Patiala={"Patiala"};
    String[] Bathinda={"Bathinda"};
    String[] Mohali={"Mohali"};
    String[] Firozpur={"Firozpur"};
    String[] Batala={"Batala"};
    String[] Pathankot={"Pathankot"};
    String[] Moga={"Moga"};
    String[] Abohar={"Abohar"};
    String[] Malerkotla={"Malerkotla"};
    String[] Khanna={"Khanna"};
    String[] Phagwara={"Phagwara"};
    String[] Muktsar={"Muktsar"};
    String[] Barnala={"Barnala"};
    String[] Rajpura={"Rajpura"};
    String[] Hoshiarpur={"Hoshiarpur"};
    String[] Kapurthala={"Kapurthala"};
    String[] Faridkot={"Faridkot"};
    String[] Sunam={"Sunam"};
    String[] Jaipur={"Campus Parlour","Akad-Bakad", "CafeEngineers", "Baba Juice", "TFB", "Bazzinga", "OP Maggie Corner" , "Vinayak"};
    String[] Jodhpur={"Jodhpur"};
    String[] Kota ={"Kota "};
    String[] Bhiwadi={"Bhiwadi"};
    String[] Bikaner={"Bikaner"};
    String[] Udaipur={"Udaipur"};
    String[] Ajmer={"Ajmer"};
    String[] Bhilwara={"Bhilwara"};
    String[] Alwar={"Alwar"};
    String[] Sikar={"Sikar"};
    String[] Bharatpur={"Ravi Tiffin Center (Yash Meena)"};
    String[] Pali={"Pali"};
    String[] SriGanganagar={"SriGanganagar"};
    String[] Kishangarh={"Kishangarh"};
    String[] Baran={"Baran"};
    String[] Dhaulpur={"Dhaulpur"};
    String[] Tonk={"Tonk"};
    String[] Beawar={"Beawar"};
    String[] Hanumangarh={"Hanumangarh"};
    String[] Gangtok={"Gangtok"};
    String[] Mangan={"Mangan"};
    String[] Namchi={"Namchi"};
    String[] Gyalshing={"Gyalshing"};
    String[] Pakyong={"Pakyong"};
    String[] Soreng={"Soreng"};
    String[] Chennai={"Chennai"};
    String[] Coimbatore={"Coimbatore"};
    String[] Madural={"Madural"};
    String[] Tiruchirappalli={"Tiruchirappalli"};
    String[] Salem={"Salem"};
    String[] Tirunelveli={"Tirunelveli"};
    String[] Tiruppur={"Tiruppur"};
    String[] Vellore={"Vellore"};
    String[] Erode={"Erode"};
    String[] Thoothukkudi={"Thoothukkudi"};
    String[] Dindigul={"Dindigul"};
    String[] Thanjavur={"Thanjavur"};
    String[] Ranipet={"Ranipet"};
    String[] Sivakasi={"Sivakasi"};
    String[] Karur={"Karur"};
    String[] Udhagamandalam={"Udhagamandalam"};
    String[] Hosur={"Hosur"};
    String[] Nagercoil={"Nagercoil"};
    String[] Kanchipuram={"Kanchipuram"};
    String[] Kumarapalayam={"Kumarapalayam"};
    String[] Karaikkudi={"Karaikkudi"};
    String[] Neyveli={"Neyveli"};
    String[] Cuddalore={"Cuddalore"};
    String[] Kumbakonam={"Kumbakonam"};
    String[] Tiruvannamalai={"Tiruvannamalai"};
    String[] Pollachi={"Pollachi"};
    String[] Rajapalayam={"Rajapalayam"};
    String[] Gudiyatham={"Gudiyatham"};
    String[] Pudukkottai={"Pudukkottai"};
    String[] Vaniyambadi={"Vaniyambadi"};
    String[] Ambur={"Ambur"};
    String[] Nagapattinam={"Nagapattinam"};
    String[] Hyderabad={"Hyderabad"};
    String[] Warangala={"Warangala"};
    String[] Nizamabad={"Nizamabad"};
    String[] Khammam={"Khammam"};
    String[] Karimnagar={"Karimnagar"};
    String[] Ramagundam={"Ramagundam"};
    String[] Mahabubnagar={"Mahabubnagar"};
    String[] Nalgonda={"Nalgonda"};
    String[] Adilabad={"Adilabad"};
    String[] Suryapet ={"Suryapet "};
    String[] Siddipet={"Siddipet"};
    String[] Miryalaguda={"Miryalaguda"};
    String[] Jagtial={"Jagtial"};
    String[] Mancherial={"Mancherial"};
    String[] Nimal={"Nimal"};
    String[] Sircilla={"Sircilla"};
    String[] Kamareddy={"Kamareddy"};
    String[] Palwancha={"Palwancha"};
    String[] Kothagudem={"Kothagudem"};
    String[] Bodhan={"Bodhan"};
    String[] Sangareddy={"Sangareddy"};
    String[] Metpally={"Metpally"};
    String[] Zahirabad={"Zahirabad"};
    String[] MeerpetJillelguda={"MeerpetJillelguda"};
    String[] Korutla={"Korutla"};
    String[] Tandur={"Tandur"};
    String[] Badangpet={"Badangpet"};
    String[] Kodad={"Kodad"};
    String[] Armur={"Armur"};
    String[] Gadwal={"Gadwal"};
    String[] Wanaparthy={"Wanaparthy"};
    String[] Kagaznagar={"Kagaznagar"};
    String[] Bellampalle={"Bellampalle"};
    String[] KhanapuramHaveli={"KhanapuramHaveli"};
    String[] Bhuvanagiri={"Bhuvanagiri"};
    String[] Vikarabad={"Vikarabad"};
    String[] Jangaon={"Jangaon"};
    String[] Mandamam={"Mandamam"};
    String[] Peerzadiguda={"Peerzadiguda"};
    String[] Bhadrachalam={"Bhadrachalam"};
    String[] Bhainsa={"Bhainsa"};
    String[] Boduppal={"Boduppal"};
    String[] Jawaharnagar={"Jawaharnagar"};
    String[] Medak={"Medak"};
    String[] Shamshabad={"Shamshabad"};
    String[] Mahabubabad={"Mahabubabad"};
    String[] Bhupalpally={"Bhupalpally"};
    String[] Narayanpet={"Narayanpet"};
    String[] Peddapaill={"Peddapaill"};
    String[] Dundigal={"Dundigal"};
    String[] Huzumagar={"Huzumagar"};
    String[] Medchal={"Medchal"};
    String[] BandlagudaJagir={"BandlagudaJagir"};
    String[] Kyathanpally={"Kyathanpally"};
    String[] Manuguru={"Manuguru"};
    String[] Naspur={"Naspur"};
    String[] Narsampet={"Narsampet"};
    String[] Devarakonda={"Devarakonda"};
    String[] Dubbaka={"Dubbaka"};
    String[] Nakrekal={"Nakrekal"};
    String[] Banswada={"Banswada"};
    String[] Kalwakurthy={"Kalwakurthy"};
    String[] NagarKurnool={"NagarKurnool"};
    String[] Parigi={"Parigi"};
    String[] Thumkunta={"Thumkunta"};
    String[] Neredcherla={"Neredcherla"};
    String[] Nagaram={"Nagaram"};
    String[] Gajwel={"Gajwel"};
    String[] Chennur={"Chennur"};
    String[] Asifabad={"Asifabad"};
    String[] Madhira={"Madhira"};
    String[] Ghatkesar={"Ghatkesar"};
    String[] Kompally={"Kompally"};
    String[] Dasnapur={"Dasnapur"};
    String[] Sarapaka={"Sarapaka"};
    String[] Husnabad={"Husnabad"};
    String[] Pocharam={"Pocharam"};
    String[] Dammaiguda={"Dammaiguda"};
    String[] Achampet={"Achampet"};
    String[] Agartala={"Agartala"};
    String[] Dharmanagar={"Dharmanagar"};
    String[] Udaipurr={"Udaipur"};
    String[] Kailashahar={"Kailashahar"};
    String[] Bishalgarh={"Bishalgarh"};
    String[] Teliamura={"Teliamura"};
    String[] Khowai={"Khowai"};
    String[] Belonia={"Belonia"};
    String[] Melaghar={"Melaghar"};
    String[] Mohanpur={"Mohanpur"};
    String[] Ambassa={"Ambassa"};
    String[] Ranirbazar={"Ranirbazar"};
    String[] Santirbazar={"Santirbazar"};
    String[] Kumarghat={"Kumarghat"};
    String[] Sonamura={"Sonamura"};
    String[] Panisagar={"Panisagar"};
    String[] Amarpur={"Amarpur"};
    String[] Jirania={"Jirania"};
    String[] Kamalpur={"Kamalpur"};
    String[] Sabroom={"Sabroom"};
    String[] Kanpur={"Kanpur"};
    String[] Lucknow={"Lucknow"};
    String[] Ghaziabad={"Ghaziabad"};
    String[] Meerut={"Meerut"};
    String[] Varanasi={"Varanasi"};
    String[] Prayagraj={"Prayagraj"};
    String[] Bareilly={"Bareilly"};
    String[] Moradabad={"Moradabad"};
    String[] Saharanpur={"Saharanpur"};
    String[] Gorakhpur={"Gorakhpur"};
    String[] Noida={"Noida"};
    String[] Firozabad={"Firozabad"};
    String[] Jhansi={"Jhansi"};
    String[] Muzaffarnagar={"Muzaffarnagar"};
    String[] Goverdhan={"Goverdhan"};
    String[] Vrindavan={"Vrindavan"};
    String[] Budaun={"Budaun"};
    String[] Raampur={"Rampur"};
    String[] Shahjahanpur={"Shahjahanpur"};
    String[] FarrukhabadcumFategarh={"FarrukhabadcumFategarh"};
    String[] FaizabadandAyodhya={"FaizabadandAyodhya"};
    String[] MaunathBhanjan={"MaunathBhanjan"};
    String[] Hapur={"Hapur"};
    String[] Ayodhya={"Ayodhya"};
    String[] Etawah={"Etawah"};
    String[] MirzapurcumVindhyachal={"MirzapurcumVindhyachal"};
    String[] Bulandshahr={"Bulandshahr"};
    String[] Sambhal={"Sambhal"};
    String[] Amroha={"Amroha"};
    String[] Hardoi={"Hardoi"};
    String[] Fatehpur={"Fatehpur"};
    String[] Raebareli={"Raebareli"};
    String[] Orai={"Orai"};
    String[] Sitapur={"Sitapur"};
    String[] Bahraich={"Bahraich"};
    String[] Modinagar={"Modinagar"};
    String[] Unnao={"Unnao"};
    String[] Jaunpur={"Jaunpur"};
    String[] Lakhimpur={"Lakhimpur"};
    String[] Hathras={"Hathras"};
    String[] Banda={"Banda"};
    String[] Pilibhit={"Pilibhit"};
    String[] Barabanki={"Barabanki"};
    String[] Khurja={"Khurja"};
    String[] Gonda={"Gonda"};
    String[] Mainpuri={"Mainpuri"};
    String[] Lalitpur={"Lalitpur"};
    String[] Etah={"Etah"};
    String[] Deoria={"Deoria"};
    String[] Ujhani={"Ujhani"};
    String[] Ghazipur={"Ghazipur"};
    String[] Sultanpur={"Sultanpur"};
    String[] Azamgarh={"Azamgarh"};
    String[] Bijnor={"Bijnor"};
    String[] Sahaswan={"Sahaswan"};
    String[] Basti={"Basti"};
    String[] Chandausi={"Chandausi"};
    String[] Akbarpur={"Akbarpur"};
    String[] Ballia={"Ballia"};
    String[] Tanda={"Tanda"};
    String[] GreaterNoida={"GreaterNoida"};
    String[] Shikohabad={"Shikohabad"};
    String[] Shamli={"Shamli"};
    String[] Awagarh={"Awagarh"};
    String[] Kasganj={"Kasganj"};
    String[] Dehradun={"Dehradun"};
    String[] Haridwar={"Haridwar"};
    String[] Roorkee={"Roorkee"};
    String[] HaldwanicumKathgodamNainital={"HaldwanicumKathgodamNainital"};
    String[] Rudrapur={"Rudrapur"};
    String[] Kashipur={"Kashipur"};
    String[] Rishikesh={"Rishikesh"};
    String[] Kolkata={"Kolkata"};
    String[] Asansol={"Asansol"};
    String[] Siliguri={"Siliguri"};
    String[] Durgapur={"Durgapur"};
    String[] Bardhaman={"Bardhaman"};
    String[] Malda={"Malda"};
    String[] Baharampur={"Baharampur"};
    String[] Habra={"Habra"};
    String[] Kharagpur={"Kharagpur"};
    String[] Shantipur={"Shantipur"};
    String[] Dankuni={"Dankuni"};
    String[] Dhulian={"Dhulian"};
    String[] Ranaghat={"Ranaghat"};
    String[] Haldia={"Haldia"};
    String[] Raiganj={"Raiganj"};
    String[] Krishnanagar={"Krishnanagar"};
    String[] Nabadwip={"Nabadwip"};
    String[] Medinipur={"Medinipur"};
    String[] Jalpaiguri={"Jalpaiguri"};
    String[] Balurghat={"Balurghat"};
    String[] Basirhat={"Basirhat"};
    String[] Bankura={"Bankura"};
    String[] Chakdaha={"Chakdaha"};
    String[] Darjeeling={"Darjeeling"};
    String[] Alipurduar={"Alipurduar"};
    String[] Purulia={"Purulia"};
    String[] Jangipur={"Jangipur"};
    String[] Bolpur={"Bolpur"};
    String[] Bangaon={"Bangaon"};
    String[] CoochBehar={"CoochBehar"};



        String[] c4 = getResources().getStringArray((R.array.genderr));
        ArrayAdapter<String> a4 = new ArrayAdapter<>(this, R.layout.dropdown_item, c4);
//        AutoCompleteTextView autoCompleteTextView= findViewById(R.id.filledexpose);
        filledexpose.setAdapter(a4);
        filledexpose.setOnItemClickListener((parent, view, position, id) -> {
            filledexposea = (String) parent.getItemAtPosition(position);
            if(filledexposea.contains("Other")){
                sdet0.setVisibility(View.VISIBLE);
                filledexposea = g0.getText().toString().trim();
            }
            else{
                sdet0.setVisibility(View.GONE);
                filledexposea = (String) parent.getItemAtPosition(position);
            }
        });

        String[] c5 = getResources().getStringArray((R.array.State));
        ArrayAdapter<String> a5 = new ArrayAdapter<>(this, R.layout.dropdown_item, c5);
//        AutoCompleteTextView autoCompleteTextViewstate = findViewById(R.id.statefilledexpose);
        statefilledexpose.setAdapter(a5);
        statefilledexpose.setOnItemClickListener((parent, view, position, id) -> {
            statefilledexposea = (String) parent.getItemAtPosition(position);
            if(statefilledexposea.contains("Other")){
                sdet000.setVisibility(View.VISIBLE);
                statefilledexposea = g000.getText().toString().trim();

            }
            else{
                sdet000.setVisibility(View.GONE);
                statefilledexposea = (String) parent.getItemAtPosition(position);
            }



            if (statefilledexposea.equals("Maharashtra")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Maharashtra) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            /*
            if (statefilledexposea.equals("UttarPradesh")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : UttarPradesh) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("AndhraPradesh")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : AndhraPradesh) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("ArunachalPradesh")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : ArunachalPradesh) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Assam")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Assam) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Bihar")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Bihar) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Chandigarh")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Chandigarh) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Chattisgarh")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Chattisgarh) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("DadraandNagarHaveli")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : DadraandNagarHaveli) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("DamanandDiu")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : DamanandDiu) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Delhi")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Delhi) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Goa")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Goa) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Gujarat")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Gujarat) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Haryana")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Haryana) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("HimachalPradesh")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : HimachalPradesh) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("JammuandKashmir")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : JammuandKashmir) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Jharkhand")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Jharkhand) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Karnataka")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Karnataka) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Kerala")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Kerala) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Ladakh")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Ladakh) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("MadhyaPradesh")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : MadhyaPradesh) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Manipur")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Manipur) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Meghalaya")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Meghalaya) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Mizoram")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Mizoram) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Nagaland")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Nagaland) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Odisha")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Odisha) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Puducherry")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Puducherry) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Punjab")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Punjab) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Rajasthan")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Rajasthan) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Sikkim")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Sikkim) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("TamilNadu")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : TamilNadu) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Telangana")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Telangana) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Tripura")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Tripura) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("Uttarakhand")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : Uttarakhand) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }
            if (statefilledexposea.equals("WestBengal")) {
                ArrayList<String> list = new ArrayList<>();
                for (String text : WestBengal) {
                    list.add(text);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, list);

                city.setAdapter(arrayAdapter);
            }

             */
            

        });

        city.setOnItemClickListener((parent, view, position, id) -> {
            citya = (String) parent.getItemAtPosition(position);

                   if (citya.equals("Mumbai")) {
                        ArrayList<String> listt = new ArrayList<>();
                        for (String text : Mumbai) {
                            listt.add(text);
                        }
                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
                        district.setAdapter(arrayAdapter);
                    }

        });
//
//                    if (citya.equals("Pune")) {
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Pune) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//
//                    if (citya.equals("Aurangabad")) {
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Aurangabad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//
//                    if (citya.equals("Mathura")) {
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mathura) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Aligarh")) {
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Aligarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Agra")) {
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Agra) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Visakhapatnam")) {
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Visakhapatnam) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Vijayawada")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Vijayawada) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Guntur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Guntur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nellore")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nellore) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kurnool")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kurnool) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kakinada")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kakinada) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rajahmundry")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rajahmundry) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kadapa")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kadapa) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tirupati")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tirupati) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Anantapuram")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Anantapuram) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Vizianagaram")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Vizianagaram) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Eluru")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Eluru) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nandyal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nandyal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ongole")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ongole) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Adoni")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Adoni) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Madanapalle")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Madanapalle) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Machilipatnam")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Machilipatnam) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tenali")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tenali) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Proddatur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Proddatur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chittoor")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chittoor) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hindupur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hindupur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Srikakulam")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Srikakulam) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhimavaram")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhimavaram) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tadepalligudem")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tadepalligudem) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Guntakal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Guntakal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dharmavaram")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dharmavaram) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gudivada")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gudivada) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Narasaraopet")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Narasaraopet) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kadiri")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kadiri) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tadipatri")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tadipatri) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mangalagin")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mangalagin) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chilakaluripet")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chilakaluripet) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("ChanglangDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : ChanglangDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("DibangValleyDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : DibangValleyDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("EastKamengDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : EastKamengDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("EastSiangDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : EastSiangDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("KurungKumeyDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : KurungKumeyDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("LohitDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : LohitDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("LowerDibangValleyDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : LowerDibangValleyDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("LowerSubansiriDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : LowerSubansiriDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("PapumPareDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : PapumPareDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("TawangDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : TawangDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("TirapDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : TirapDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("UpperSiangDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : UpperSiangDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("UpperSubansiriDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : UpperSubansiriDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("WestKamengDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : WestKamengDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("WestSiangDistrict")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : WestSiangDistrict) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Guwahat")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Guwahat) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Silchar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Silchar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dibrugarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dibrugarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jorhat")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jorhat) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nagaon")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nagaon) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bongaigaon")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bongaigaon) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tinsukia")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tinsukia) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tezpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tezpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Diphu")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Diphu) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dhubri")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dhubri) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("NorthLakhimpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : NorthLakhimpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Karimganj")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Karimganj) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sivasagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sivasagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Goalpara")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Goalpara) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("BarpetaTown")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : BarpetaTown) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Golaghat")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Golaghat) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hafiong")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hafiong) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mangaldai")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mangaldai) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tangla")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tangla) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Lanka")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Lanka) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hojai")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hojai) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("BarpetaRoad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : BarpetaRoad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kokrajhar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kokrajhar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hailakandi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hailakandi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Morigaon")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Morigaon) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nalbari")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nalbari) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rangia")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rangia) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Silapathar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Silapathar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dhekiajuli")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dhekiajuli) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dergaon")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dergaon) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sonari")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sonari) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kharupetia")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kharupetia) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nazira")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nazira) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Lakhipur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Lakhipur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Patna")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Patna) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gaya")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gaya) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhagalpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhagalpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Purnia")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Purnia) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Muzafaffarpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Muzafaffarpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Darbhanga")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Darbhanga) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("BiharShaif")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : BiharShaif) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Arrah")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Arrah) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Begusald")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Begusald) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Katihar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Katihar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Munger")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Munger) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chhapra")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chhapra) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Danapur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Danapur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bettian")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bettian) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("saharsa")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : saharsa) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hajipur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hajipur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sasaram")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sasaram) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dehri")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dehri) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Siwan")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Siwan) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Motihar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Motihar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nawada")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nawada) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bagand")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bagand) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Buxar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Buxar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kishanganj")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kishanganj) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sitamarhi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sitamarhi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jamalpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jamalpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jehanabad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jehanabad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Aurangabad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Aurangabad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chandigarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chandigarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("NayaRaipur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : NayaRaipur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Raipur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Raipur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhilai")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhilai) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bilaspur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bilaspur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Korba")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Korba) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rajnandgaon")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rajnandgaon) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Raigarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Raigarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ambikapur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ambikapur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jagdalpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jagdalpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chirmiri")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chirmiri) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dhamtari")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dhamtari) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mahasamund")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mahasamund) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("DadraandNagarHaveli")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : DadraandNagarHaveli) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("DamanandDiu")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : DamanandDiu) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Delhi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Delhi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bicholim")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bicholim) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Canacona")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Canacona) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Cuncolim")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Cuncolim) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Curchorem")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Curchorem) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mapusa")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mapusa) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Margao")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Margao) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mormugao")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mormugao) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Panaji")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Panaji) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Pernem")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Pernem) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ponda")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ponda) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Quepem")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Quepem) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sanguem")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sanguem) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sanquelim")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sanquelim) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Valpoi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Valpoi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Amdavad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Amdavad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Surat")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Surat) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Vadodara")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Vadodara) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rajkot")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rajkot) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhavnagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhavnagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jamnagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jamnagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gandhinagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gandhinagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Junagadh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Junagadh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gandhidham")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gandhidham) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Anand")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Anand) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Navsari")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Navsari) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Morbi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Morbi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nadiad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nadiad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Surendranagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Surendranagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bharuch")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bharuch) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mehsana")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mehsana) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhuj")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhuj) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Porbandar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Porbandar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Palanpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Palanpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Valsad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Valsad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Vapi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Vapi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gondal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gondal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Veraval")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Veraval) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Godhra")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Godhra) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Patan")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Patan) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kalol")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kalol) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dahod")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dahod) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Botad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Botad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Amreli")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Amreli) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Deesa")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Deesa) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jetpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jetpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Faridabad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Faridabad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gurugram")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gurugram) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Panipat")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Panipat) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ambala")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ambala) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Yamunanagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Yamunanagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rohtak")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rohtak) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hisar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hisar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Karnal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Karnal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sonipat")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sonipat) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Panchkula")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Panchkula) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhiwani")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhiwani) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sirsa")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sirsa) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bahadurgarn")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bahadurgarn) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jind")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jind) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Thanesar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Thanesar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kaithal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kaithal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rewari")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rewari) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Narnaul")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Narnaul) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Pundri")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Pundri) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kosli")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kosli) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Palwal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Palwal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Shimla")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Shimla) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dharamsala")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dharamsala) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Solan")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Solan) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mandi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mandi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Palampur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Palampur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Baddi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Baddi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nahan")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nahan) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("PaontaSahib")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : PaontaSahib) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sundanagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sundanagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chamba")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chamba) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Una")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Una) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kullu")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kullu) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hamirpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hamirpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bilaspur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bilaspur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("YolCantonment")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : YolCantonment) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nalagarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nalagarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nurpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nurpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kangra")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kangra) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Santokhgarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Santokhgarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("MehatpurBasdehra")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : MehatpurBasdehra) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Shamshi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Shamshi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Parwanoo")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Parwanoo) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Manali")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Manali) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("TiraSujanpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : TiraSujanpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ghumarwin")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ghumarwin) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dalhousie")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dalhousie) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rohru")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rohru) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("NagrotaBagwan")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : NagrotaBagwan) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rampur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rampur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jawalamukhi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jawalamukhi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jogindernagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jogindernagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("DeraGopipur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : DeraGopipur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sarkaghat")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sarkaghat) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jhakhri")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jhakhri) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Indora")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Indora) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhuntar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhuntar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nadaun")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nadaun) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Theog")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Theog) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("KasauliCantonment")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : KasauliCantonment) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gagret")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gagret) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("ChuariKhas")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : ChuariKhas) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Daulatpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Daulatpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("SabathuCantonment")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : SabathuCantonment) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("DalhousieCantonment")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : DalhousieCantonment) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Raigarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Raigarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Arki")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Arki) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("DagshaiCantonment")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : DagshaiCantonment) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Seoni")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Seoni) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Talai")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Talai) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("JutoghCantonment")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : JutoghCantonment) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chaupal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chaupal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rewalsar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rewalsar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("BaklohCantonment")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : BaklohCantonment) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jubbal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jubbal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhota")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhota) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Banjar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Banjar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("NainaDevi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : NainaDevi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kotkhai")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kotkhai) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Narkanda")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Narkanda) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Srinagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Srinagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jammu")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jammu) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Anantnag")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Anantnag) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jamshedpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jamshedpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dhanbad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dhanbad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ranchi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ranchi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("BokaroSteelCity")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : BokaroSteelCity) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Deoghar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Deoghar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Phusro")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Phusro) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hazaribagh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hazaribagh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Giridih")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Giridih) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ramgarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ramgarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Medininagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Medininagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chirkunda")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chirkunda) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bangalore")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bangalore) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("HubliDharwad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : HubliDharwad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mysore")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mysore) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gulbarga")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gulbarga) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mangalore")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mangalore) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Belgaum")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Belgaum) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Davanagere")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Davanagere) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bellary")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bellary) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bijapur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bijapur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Shimoga")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Shimoga) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tumkur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tumkur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Raichur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Raichur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bidar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bidar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hospet")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hospet) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("GadagBetageri")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : GadagBetageri) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Robertsonpet")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Robertsonpet) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hassan")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hassan) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhadravati")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhadravati) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chitradurga")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chitradurga) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Udupi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Udupi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kolar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kolar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mandya")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mandya) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chikmagalur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chikmagalur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gangavati")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gangavati) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bagalkot")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bagalkot) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ranebennuru")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ranebennuru) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Thiruvananthapuram")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Thiruvananthapuram) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
////                    if (citya.equals("Kozhikode")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kozhikode) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kochi")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kochi) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kollam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kollam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Thrissur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Thrissur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kannur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kannur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Alappuzha")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Alappuzha) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kottayam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kottayam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Palakkad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Palakkad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Manjeri")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Manjeri) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Thalassery")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Thalassery) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Ponnani")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Ponnani) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Vatakara")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Vatakara) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kanhangad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kanhangad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Payyanur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Payyanur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Koyilandy")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Koyilandy) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Parappanangadi")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Parappanangadi) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kalamassery")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kalamassery) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Neyyattinkara")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Neyyattinkara) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Tanur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Tanur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Thrippunithura")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Thrippunithura) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kayamkulam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kayamkulam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Malappuram")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Malappuram) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Thrikkakkara")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Thrikkakkara) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Wadakkancherry")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Wadakkancherry) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Nedumangad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Nedumangad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kondotty")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kondotty) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Tirurangad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Tirurangad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("irur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : irur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Panoor")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Panoor) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Nileshwaram")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Nileshwaram) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kasaragod")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kasaragod) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Feroke")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Feroke) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("KunnamkUlam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : KunnamkUlam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Ottappalam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Ottappalam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Tiruvalla")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Tiruvalla) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Thodupuzha")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Thodupuzha) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Perinthalmanna")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Perinthalmanna) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Chalakudy")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Chalakudy) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Payyoll")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Payyoll) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Koduvally")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Koduvally) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Mananthavady")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Mananthavady) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Changanassery")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Changanassery) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Mattanur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Mattanur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Punalur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Punalur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Nilambur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Nilambur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Cherthala")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Cherthala) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("SultanBathery")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : SultanBathery) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Maradu")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Maradu) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kottakkal")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kottakkal) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Taliparamba")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Taliparamba) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Shornur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Shornur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("ndalam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : ndalam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kattappana")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kattappana) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Mukkam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Mukkam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("ty")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : ty) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("chery")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : chery) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Varkala")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Varkala) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Cherpulassery")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Cherpulassery) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Chavakkad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Chavakkad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kothamangalam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kothamangalam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Pathanamthitta")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Pathanamthitta) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Atingal")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Atingal) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("aravur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : aravur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Ramanattukara")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Ramanattukara) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Mannarkkad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Mannarkkad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("rattupetta")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : rattupetta) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kodungallur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kodungallur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Sreekandapuram")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Sreekandapuram) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Anganiauy")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Anganiauy) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Chittur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Chittur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Thathamangalam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Thathamangalam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kalpetta")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kalpetta) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("NorthParavur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : NorthParavur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Haripad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Haripad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Muvattupuzha")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Muvattupuzha) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kottarakara")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kottarakara) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kuthuparamba")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kuthuparamba) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Adoor")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Adoor) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Piravom")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Piravom) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Irinjalakuda")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Irinjalakuda) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Pattambi")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Pattambi) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Anthoor")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Anthoor) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Perumbavoor")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Perumbavoor) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Ettumanoor")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Ettumanoor) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Mavelikkara")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Mavelikkara) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Karunagappalli")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Karunagappalli) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Eloor")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Eloor) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Chengannur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Chengannur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Vaikom")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Vaikom) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Aluva")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Aluva) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Pala")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Pala) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Guruvayur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Guruvayur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Koothattukulam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Koothattukulam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Avinissery")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Avinissery) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
//                    if (citya.equals("Ladakh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ladakh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Indore")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Indore) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhopal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhopal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jabalpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jabalpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gwalior")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gwalior) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Katni")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Katni) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ujjain")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ujjain) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dewas")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dewas) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Satna")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Satna) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ratlam")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ratlam) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rewa")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rewa) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Singrauli")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Singrauli) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Burhanpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Burhanpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Khandwa")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Khandwa) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhind")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhind) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chhindwara")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chhindwara) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Guna")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Guna) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Shivpuri")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Shivpuri) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Vidisha")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Vidisha) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chhatarpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chhatarpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Damoh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Damoh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mandsaur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mandsaur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Khargone")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Khargone) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Neemuch")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Neemuch) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Pithampur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Pithampur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Narmadapuram")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Narmadapuram) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Itarsi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Itarsi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sehore")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sehore) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Morena")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Morena) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Betul")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Betul) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Seoni")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Seoni) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Datia")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Datia) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nagda")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nagda) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dindori")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dindori) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mumbai")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mumbai) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Pune")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Pune) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nagpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nagpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Thane")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Thane) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("PCMCPune")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : PCMCPune) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nashik")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nashik) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("KalyanDombivli")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : KalyanDombivli) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("VasaiVirarCityMC")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : VasaiVirarCityMC) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Aurangabad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Aurangabad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("NaviMumbai")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : NaviMumbai) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Solapur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Solapur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("MiraBhayandar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : MiraBhayandar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("BhiwandiNizampurMC")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : BhiwandiNizampurMC) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jalgaon")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jalgaon) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Amravati")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Amravati) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nanded")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nanded) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kolhapur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kolhapur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ulhasnagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ulhasnagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("SangliMirajKupwad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : SangliMirajKupwad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Malegaon")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Malegaon) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Akola")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Akola) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Latur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Latur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dhule")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dhule) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ahmednagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ahmednagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chandrapur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chandrapur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Parbhani")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Parbhani) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ichalkaranji")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ichalkaranji) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jalna")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jalna) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ambarnath")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ambarnath) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhusawal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhusawal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Panvel")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Panvel) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Badlapur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Badlapur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Beed")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Beed) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gondia")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gondia) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Satara")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Satara) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Barshi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Barshi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Yavatmal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Yavatmal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Achalpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Achalpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Osmanabad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Osmanabad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nandurbar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nandurbar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Wardha")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Wardha) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Udgir")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Udgir) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hinganghat")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hinganghat) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bishnupur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bishnupur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Thoubal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Thoubal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("ImphalEast")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : ImphalEast) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("ImphalWest")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : ImphalWest) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Senapati")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Senapati) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ukhrul")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ukhrul) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chandel")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chandel) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Churachandpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Churachandpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tamenglong")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tamenglong) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jiribam")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jiribam) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kangpokpi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kangpokpi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kakching")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kakching) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tengnoupal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tengnoupal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kamjong")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kamjong) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Noney")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Noney) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Pherzawi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Pherzawi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Meghalaya")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Meghalaya) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Aizawl")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Aizawl) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kolasib")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kolasib) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Lawngtlai")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Lawngtlai) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Lunglei")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Lunglei) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mamit")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mamit) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Saiha")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Saiha) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Serchhip")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Serchhip) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Champhai")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Champhai) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hnahthial")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hnahthial) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Khawzawl")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Khawzawl) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Saitual")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Saitual) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dimapur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dimapur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kiphire")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kiphire) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kohima")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kohima) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Longleng")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Longleng) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mokokchung")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mokokchung) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mon")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mon) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Peren")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Peren) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Phek")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Phek) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tuensang")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tuensang) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Wokha")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Wokha) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Zunhebote")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Zunhebote) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhubaneswar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhubaneswar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Cuttack")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Cuttack) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rourkela")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rourkela) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Berhampur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Berhampur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sambalpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sambalpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Puri")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Puri) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Balasore")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Balasore) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhadrak")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhadrak) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Baripada")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Baripada) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Puducherry")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Puducherry) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ludhiana")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ludhiana) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Amritsar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Amritsar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jalandhar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jalandhar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Patiala")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Patiala) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bathinda")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bathinda) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mohali")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mohali) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Firozpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Firozpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Batala")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Batala) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Pathankot")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Pathankot) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Moga")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Moga) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Abohar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Abohar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Malerkotla")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Malerkotla) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Khanna")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Khanna) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Phagwara")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Phagwara) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Muktsar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Muktsar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Barnala")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Barnala) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rajpura")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rajpura) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hoshiarpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hoshiarpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kapurthala")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kapurthala) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Faridkot")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Faridkot) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sunam")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sunam) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jaipur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jaipur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jodhpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jodhpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kota ")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kota ) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhiwadi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhiwadi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bikaner")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bikaner) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Udaipur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Udaipur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ajmer")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ajmer) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bhilwara")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bhilwara) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Alwar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Alwar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sikar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sikar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bharatpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bharatpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Pali")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Pali) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("SriGanganagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : SriGanganagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kishangarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kishangarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Baran")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Baran) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dhaulpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dhaulpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tonk")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tonk) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Beawar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Beawar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hanumangarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hanumangarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gangtok")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gangtok) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mangan")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mangan) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Namchi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Namchi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gyalshing")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gyalshing) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Pakyong")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Pakyong) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Soreng")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Soreng) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chennai")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chennai) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Coimbatore")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Coimbatore) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Madural")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Madural) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tiruchirappalli")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tiruchirappalli) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Salem")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Salem) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tirunelveli")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tirunelveli) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tiruppur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tiruppur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Vellore")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Vellore) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Erode")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Erode) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Thoothukkudi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Thoothukkudi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dindigul")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dindigul) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Thanjavur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Thanjavur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ranipet")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ranipet) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sivakasi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sivakasi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Karur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Karur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Udhagamandalam")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Udhagamandalam) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hosur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hosur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nagercoil")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nagercoil) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kanchipuram")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kanchipuram) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kumarapalayam")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kumarapalayam) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Karaikkudi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Karaikkudi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Neyveli")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Neyveli) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Cuddalore")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Cuddalore) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kumbakonam")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kumbakonam) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tiruvannamalai")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tiruvannamalai) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
////                    if (citya.equals("Pollachi")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Pollachi) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Rajapalayam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Rajapalayam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Gudiyatham")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Gudiyatham) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Pudukkottai")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Pudukkottai) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Vaniyambadi")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Vaniyambadi) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Ambur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Ambur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Nagapattinam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Nagapattinam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Hyderabad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Hyderabad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Warangala")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Warangala) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Nizamabad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Nizamabad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Khammam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Khammam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Karimnagar")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Karimnagar) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Ramagundam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Ramagundam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Mahabubnagar")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Mahabubnagar) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Nalgonda")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Nalgonda) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Adilabad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Adilabad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Suryapet ")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Suryapet ) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Siddipet")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Siddipet) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Miryalaguda")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Miryalaguda) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Jagtial")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Jagtial) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Mancherial")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Mancherial) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Nimal")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Nimal) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Sircilla")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Sircilla) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kamareddy")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kamareddy) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Palwancha")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Palwancha) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kothagudem")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kothagudem) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Bodhan")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Bodhan) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Sangareddy")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Sangareddy) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Metpally")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Metpally) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Zahirabad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Zahirabad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("MeerpetJillelguda")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : MeerpetJillelguda) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Korutla")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Korutla) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Tandur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Tandur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Badangpet")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Badangpet) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kodad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kodad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Armur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Armur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Gadwal")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Gadwal) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Wanaparthy")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Wanaparthy) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kagaznagar")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kagaznagar) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Bellampalle")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Bellampalle) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("KhanapuramHaveli")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : KhanapuramHaveli) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Bhuvanagiri")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Bhuvanagiri) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Vikarabad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Vikarabad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Jangaon")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Jangaon) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Mandamam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Mandamam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Peerzadiguda")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Peerzadiguda) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Bhadrachalam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Bhadrachalam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Bhainsa")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Bhainsa) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Boduppal")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Boduppal) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Jawaharnagar")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Jawaharnagar) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Medak")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Medak) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Shamshabad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Shamshabad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Mahabubabad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Mahabubabad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Bhupalpally")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Bhupalpally) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Narayanpet")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Narayanpet) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Peddapaill")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Peddapaill) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Dundigal")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Dundigal) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Huzumagar")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Huzumagar) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Medchal")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Medchal) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("BandlagudaJagir")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : BandlagudaJagir) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kyathanpally")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kyathanpally) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Manuguru")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Manuguru) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Naspur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Naspur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Narsampet")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Narsampet) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Devarakonda")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Devarakonda) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Dubbaka")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Dubbaka) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Nakrekal")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Nakrekal) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Banswada")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Banswada) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kalwakurthy")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kalwakurthy) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("NagarKurnool")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : NagarKurnool) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Parigi")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Parigi) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Thumkunta")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Thumkunta) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Neredcherla")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Neredcherla) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Nagaram")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Nagaram) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Gajwel")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Gajwel) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Chennur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Chennur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Asifabad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Asifabad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Madhira")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Madhira) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Ghatkesar")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Ghatkesar) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Kompally")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Kompally) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Dasnapur")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Dasnapur) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Sarapaka")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Sarapaka) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Husnabad")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Husnabad) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Pocharam")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Pocharam) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Dammaiguda")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Dammaiguda) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
////                    if (citya.equals("Achampet")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : Achampet) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
//                    if (citya.equals("Agartala")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Agartala) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dharmanagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dharmanagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Udaipur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Udaipur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kailashahar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kailashahar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bishalgarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bishalgarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Teliamura")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Teliamura) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Khowai")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Khowai) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Belonia")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Belonia) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Melaghar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Melaghar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mohanpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mohanpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ambassa")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ambassa) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ranirbazar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ranirbazar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Santirbazar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Santirbazar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kumarghat")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kumarghat) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sonamura")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sonamura) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Panisagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Panisagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Amarpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Amarpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jirania")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jirania) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kamalpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kamalpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sabroom")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sabroom) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mathura")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mathura) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Agra")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Agra) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Aligarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Aligarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kanpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kanpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Lucknow")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Lucknow) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ghaziabad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ghaziabad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Meerut")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Meerut) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Varanasi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Varanasi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Prayagraj")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Prayagraj) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bareilly")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bareilly) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Moradabad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Moradabad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Saharanpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Saharanpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gorakhpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gorakhpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Noida")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Noida) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Firozabad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Firozabad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jhansi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jhansi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Muzaffarnagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Muzaffarnagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Goverdhan")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Goverdhan) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Vrindavan")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Vrindavan) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Budaun")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Budaun) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rampur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rampur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Shahjahanpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Shahjahanpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("FarrukhabadcumFategarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : FarrukhabadcumFategarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("FaizabadandAyodhya")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : FaizabadandAyodhya) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("MaunathBhanjan")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : MaunathBhanjan) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hapur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hapur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ayodhya")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ayodhya) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Etawah")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Etawah) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("MirzapurcumVindhyachal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : MirzapurcumVindhyachal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bulandshahr")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bulandshahr) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sambhal")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sambhal) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Amroha")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Amroha) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hardoi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hardoi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Fatehpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Fatehpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Raebareli")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Raebareli) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Orai")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Orai) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sitapur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sitapur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bahraich")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bahraich) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Modinagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Modinagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Unnao")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Unnao) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jaunpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jaunpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Lakhimpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Lakhimpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Hathras")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Hathras) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Banda")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Banda) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Pilibhit")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Pilibhit) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Barabanki")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Barabanki) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Khurja")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Khurja) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Gonda")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Gonda) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Mainpuri")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Mainpuri) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Lalitpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Lalitpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Etah")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Etah) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Deoria")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Deoria) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ujhani")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ujhani) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ghazipur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ghazipur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sultanpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sultanpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Azamgarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Azamgarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bijnor")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bijnor) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Sahaswan")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Sahaswan) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Basti")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Basti) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chandausi")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chandausi) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Akbarpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Akbarpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ballia")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ballia) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Tanda")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Tanda) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("GreaterNoida")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : GreaterNoida) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Shikohabad")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Shikohabad) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Shamli")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Shamli) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Awagarh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Awagarh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kasganj")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kasganj) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dehradun")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dehradun) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Haridwar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Haridwar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Roorkee")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Roorkee) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("HaldwanicumKathgodamNainital")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : HaldwanicumKathgodamNainital) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rudrapur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rudrapur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kashipur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kashipur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Rishikesh")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Rishikesh) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kolkata")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kolkata) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Asansol")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Asansol) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Siliguri")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Siliguri) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Durgapur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Durgapur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bardhaman")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bardhaman) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Malda")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Malda) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Baharampur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Baharampur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Habra")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Habra) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Kharagpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Kharagpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Shantipur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Shantipur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dankuni")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dankuni) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Dhulian")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Dhulian) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Ranaghat")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Ranaghat) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Haldia")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Haldia) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Raiganj")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Raiganj) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Krishnanagar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Krishnanagar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Nabadwip")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Nabadwip) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Medinipur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Medinipur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jalpaiguri")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jalpaiguri) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Balurghat")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Balurghat) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Basirhat")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Basirhat) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bankura")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bankura) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Chakdaha")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Chakdaha) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Darjeeling")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Darjeeling) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Alipurduar")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Alipurduar) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Purulia")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Purulia) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Jangipur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Jangipur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bolpur")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bolpur) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
//                    if (citya.equals("Bangaon")){
//                        ArrayList<String> listt = new ArrayList<>();
//                        for (String text : Bangaon) {
//                            listt.add(text);
//                        }
//                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
//                        district.setAdapter(arrayAdapter);
//                    }
////                    if (citya.equals("CoochBehar")){
////                        ArrayList<String> listt = new ArrayList<>();
////                        for (String text : CoochBehar) {
////                            listt.add(text);
////                        }
////                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.dropdown_item, listt);
////                        district.setAdapter(arrayAdapter);
////                    }
//
//
//

//
        district.setOnItemClickListener((parent, view, position, id) -> {
            districta = (String) parent.getItemAtPosition(position);
            });

        String[] c6 = getResources().getStringArray((R.array.facecolor));
        ArrayAdapter<String> a6 = new ArrayAdapter<>(this, R.layout.dropdown_item, c6);
//        AutoCompleteTextView autoCompleteTextViewfc = findViewById(R.id.fcfilledexpose);
        fcfilledexpose.setAdapter(a6);
        fcfilledexpose.setOnItemClickListener((parent, view, position, id) -> {
            fcfilledexposea = (String) parent.getItemAtPosition(position);
            if(fcfilledexposea.contains("Other")){
                sdet00.setVisibility(View.VISIBLE);
                fcfilledexposea = g00.getText().toString().trim();
            }
            else{
                sdet00.setVisibility(View.GONE);
                fcfilledexposea = (String) parent.getItemAtPosition(position);
            }
        });


        String[] c1 = getResources().getStringArray((R.array.height));
        ArrayAdapter<String> a1 = new ArrayAdapter<>(this, R.layout.dropdown_item, c1);
//        AutoCompleteTextView d1 = findViewById(R.id.e1);
        e1.setAdapter(a1);
        e1.setOnItemClickListener((parent, view, position, id) -> {
            e1a = (String) parent.getItemAtPosition(position);
            if(e1a.contains("Other")){
                sdet1.setVisibility(View.VISIBLE);
                e1a = g1.getText().toString().trim();
            }
            else{
                sdet1.setVisibility(View.GONE);
                e1a = (String) parent.getItemAtPosition(position);
            }
        });

        String[] c2 = getResources().getStringArray((R.array.weight));
        ArrayAdapter<String> a2 = new ArrayAdapter<>(this, R.layout.dropdown_item, c2);
//        AutoCompleteTextView d2 = findViewById(R.id.e2);
        e2.setAdapter(a2);
        e2.setOnItemClickListener((parent, view, position, id) -> {
            e2a = (String) parent.getItemAtPosition(position);
            if(e2a.contains("Other")){
                sdet2.setVisibility(View.VISIBLE);
                e2a = g2.getText().toString().trim();

            }
            else{
                sdet2.setVisibility(View.GONE);
                e2a = (String) parent.getItemAtPosition(position);
            }
        });

        String[] c3 = getResources().getStringArray((R.array.country));
        ArrayAdapter<String> a3 = new ArrayAdapter<>(this, R.layout.dropdown_item, c3);
//        AutoCompleteTextView d3 = findViewById(R.id.e3);
        e3.setAdapter(a3);
        e3.setOnItemClickListener((parent, view, position, id) -> {
            e3a = (String) parent.getItemAtPosition(position);
            if(e3a.contains("Other")){
                sdet3.setVisibility(View.VISIBLE);
                e3a = g3.getText().toString().trim();
            }
            else{
                sdet3.setVisibility(View.GONE);
                e3a = (String) parent.getItemAtPosition(position);
            }
        });

        date_of_birthtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on below line we are getting
                // the instance of our calendar.
                Locale locale = getResources().getConfiguration().locale;
                Locale.setDefault(locale.ENGLISH);
                final Calendar c = Calendar.getInstance();

                // on below line we are getting
                // our day, month and year.
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                // on below line we are creating a variable for date picker dialog.
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        // on below line we are passing context.
                        MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // on below line we are setting date to our text view.
//                                date_of_birth.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                                date_of_birthtext.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);

                            }
                        },
                        // on below line we are passing year,
                        // month and day for selected date in our date picker.
                        year, month, day);
                // at last we are calling show to
                // display our date picker dialog.
                datePickerDialog.show();
            }
        });


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                f1a = f1.getText().toString().trim();
                f2a = f2.getEditText().toString().trim();
                f3a = f3.getEditText().toString().trim();
                f4a = f4.getEditText().toString().trim();
                f5a = f5.getEditText().toString().trim();
                full_namea = full_name.getEditText().toString().trim();
                agea = age.getEditText().toString().trim();
                date_of_birtha = date_of_birth.getEditText().toString().trim();
//                citya = city.getEditText().toString().trim();
//                districta = district.getEditText().toString().trim();
                addressa = address.getEditText().toString().trim();


//                String filledexposea = filledexpose.getText().toString().trim();
//                String e1a = e1.getText().toString().trim();
//                String e2a = e2.getText().toString().trim();
//                String fcfilledexposea = fcfilledexpose.getText().toString().trim();
//                String e3a = e3.getText().toString().trim();
//                String statefilledexposea = statefilledexpose.getText().toString().trim();
//                if(e1a.contains("Other")){
//                    e1a = g1.getText().toString().trim();
//                }
//
//                if(e3a.contains("Other")){
//                    e3a = g3.getText().toString().trim();
//                }
//                if(filledexposea.contains("Other")){
//                    filledexposea = g0.getText().toString().trim();
//                }
//                if(statefilledexposea.contains("Other")){
//                    statefilledexposea = g000.getText().toString().trim();
//                }
//                if(fcfilledexposea.contains("Other")){
//                    fcfilledexposea = g00.getText().toString().trim();
//                }


                if (isValid()) {


                    Intent intent_main_to_life = new Intent(MainActivity.this, LifeStyleActivity.class);

                    intent_main_to_life.putExtra("full_name", full_namea);
                    intent_main_to_life.putExtra("age", agea);
                    intent_main_to_life.putExtra("date_of_birth", date_of_birtha);
                    intent_main_to_life.putExtra("city", citya);
                    intent_main_to_life.putExtra("district", districta);
                    intent_main_to_life.putExtra("address", addressa);

                    intent_main_to_life.putExtra("gender", filledexposea);
                    intent_main_to_life.putExtra("height", e1a);
                    intent_main_to_life.putExtra("weight", e2a);
                    intent_main_to_life.putExtra("face_color", fcfilledexposea);
                    intent_main_to_life.putExtra("country", e3a);
                    intent_main_to_life.putExtra("state", statefilledexposea);

                    intent_main_to_life.putExtra("username", f1a);
                    intent_main_to_life.putExtra("password", f2a);
                    intent_main_to_life.putExtra("email", f3a);
                    intent_main_to_life.putExtra("phonenumber", f4a);
                    intent_main_to_life.putExtra("createfor", f5a);

                    startActivity(intent_main_to_life);

                }

//                Intent b = new Intent(, );
//                startActivity(b);

            }

        });


//        buttonRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                registerUser();
//
//
//            }
//
//        });



//        buttonRegister.setOnClickListener(this);
//        textViewLogin.setOnClickListener(this);
    }


//    private void openDatePicker(){
//        DatePickerDialog datePickerDialog = new DatePickerDialog(this, R.style.DialogTheme , new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
//
//                //Showing the picked value in the textView
//                date_of_birth.setText(String.valueOf(year)+ "."+String.valueOf(month)+ "."+String.valueOf(day));
//
//            }
//        }, 2023, 01, 20);
//
//        datePickerDialog.show();
//    }
//
//
//    private void openTimePicker(){
//
//        TimePickerDialog timePickerDialog = new TimePickerDialog(this, R.style.DialogTheme, new TimePickerDialog.OnTimeSetListener() {
//            @Override
//            public void onTimeSet(TimePicker timePicker, int hour, int minute) {
//
//
//                //Showing the picked value in the textView
//                date_of_birth.setText(String.valueOf(hour)+ ":"+String.valueOf(minute));
//
//            }
//        }, 15, 30, false);
//
//        timePickerDialog.show();
//    }




    public boolean isValid() {
        f3.setErrorEnabled(false); //email
        f3.setError("");
        full_name.setErrorEnabled(false);
        full_name.setError("");
//        lname.setErrorEnabled(false);
//        lname.setError("");
        f2.setErrorEnabled(false); //password
        f2.setError("");
//        cmpass.setErrorEnabled(false);
//        cmpass.setError("");
        f4.setErrorEnabled(false);  //mobile
        f4.setError("");

        boolean isValidfirstname = false, isValidemail = false, isvalidpassword = false,isvalid = false, isvalidmobileno = false;
        if (TextUtils.isEmpty(full_namea)) {
            full_name.setErrorEnabled(true);
            full_name.setError("Name is required");
        } else {
            isValidfirstname = true;
        }
        if (TextUtils.isEmpty(f3a)) {
            f3.setErrorEnabled(true);
            f3.setError("Email is required");
        } else {
            if (f3a.matches(emailpattern)) {
                isValidemail = true;
            } else {
                f3.setErrorEnabled(true);
                f3.setError("Enter a valid Email Address");
            }

        }
        if (TextUtils.isEmpty(f4a)) {
            f4.setErrorEnabled(true);
            f4.setError("Mobile number is required");
        } else {
            if (f4a.length() != 10) {
                f4.setErrorEnabled(true);
                f4.setError("Invalid Phone Number");
            } else {
                isvalidmobileno = true;
            }
        }
        if (TextUtils.isEmpty(f2a)) {
            f2.setErrorEnabled(true);
            f2.setError("Password is required");
        } else {
            if (f2a.length() < 6) {
                f2.setErrorEnabled(true);
                f2.setError("Password too weak");
            } else {
                isvalidpassword = true;
            }
//            if (f2a.length() < 6 || !containsUppercase(f2a) || !containsDigit(f2a) || !containsSpecialChar(f2a)) {
//                f2.setErrorEnabled(true);
//                f2.setError("Password too weak. It should have at least 6 characters, one uppercase letter, one digit, and one special character.");
//            } else {
//                isvalidpassword = true;
//            }
        }
//        if (TextUtils.isEmpty(confirmpass)) {
//            cmpass.setErrorEnabled(true);
//            cmpass.setError("Confirm Password is required");
//        } else {
//            if (!password.equals(confirmpass)) {
//                pass.setErrorEnabled(true);
//                pass.setError("Password doesn't match");
//                cmpass.setError("Password doesn't match");
//            } else {
//                isvalidconfirmpassword = true;
//            }
//        }
//        if (TextUtils.isEmpty(Localaddress)) {
//            localadd.setErrorEnabled(true);
//            localadd.setError("Local Address is required");
//        } else {
//            isValidaddress = true;
//        }
        isvalid = (isValidfirstname  && isValidemail  && isvalidpassword && isvalidmobileno) ? true : false;
        return isvalid;
    }



    private boolean containsUppercase(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    private boolean containsDigit(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    private boolean containsSpecialChar(String password) {
        // Define your set of special characters
        String specialChars = "!@#$%^&*()_+-=[]{}|;:'\",.<>/?";

        for (char ch : password.toCharArray()) {
            if (specialChars.contains(String.valueOf(ch))) {
                return true;
            }
        }
        return false;
    }


    private void registerUser() {
//        final String email = editTextEmail.getText().toString().trim();
//        final String username = editTextUsername.getText().toString().trim();
//        final String password = editTextPassword.getText().toString().trim();

        progressDialog.setMessage("Registering user...");
        progressDialog.show();

        StringRequest stringRequest = new StringRequest(Request.Method.POST,
                Constants.URL_REGISTER,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        progressDialog.dismiss();

                        try {
                            JSONObject jsonObject = new JSONObject(response);

                            Toast.makeText(getApplicationContext(), jsonObject.getString("message"), Toast.LENGTH_LONG).show();

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressDialog.hide();
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("username", "frds");
                params.put("password", "123456");
                params.put("email", "sis@gmail.com");
                params.put("phonenumber", "frds");
                params.put("createfor", "frds");
                params.put("full_name", "frds");
                params.put("age", "frds");
                params.put("date_of_birth", "frds");
                params.put("city", "frds");
                params.put("district", "frds");
                params.put("address", "frds");
                params.put("gender", "frds");
                params.put("height", "frds");
                params.put("weight", "frds");
                params.put("face_color", "frds");
                params.put("country", "frds");
                params.put("state", "frds");
                params.put("food_style", "frds");
                params.put("hobbies", "frds");
                params.put("drinking_habit", "frds");
                params.put("marital_status", "frds");
                params.put("mother_tongue", "frds");
                params.put("religion", "frds");
                params.put("caste", "frds");
                params.put("sub_caste", "frds");
                params.put("gotra", "frds");
                params.put("manglik", "frds");
                params.put("birth_location", "frds");
                params.put("birth_date", "frds");
                params.put("birth_time", "frds");
                params.put("highest_education", "frds");
                params.put("college_name", "frds");
                params.put("other_education", "frds");
                params.put("working_status", "frds");
                params.put("employed_in", "frds");
                params.put("occupation", "frds");
                params.put("income", "frds");
                params.put("current_company", "frds");
                params.put("company_location", "frds");
                return params;
            }
        };


        RequestHandler.getInstance(this).addToRequestQueue(stringRequest);


    }

//    @Override
//    public void onClick(View view) {
//        if (view == buttonRegister)
//            registerUser();
//        if(view == textViewLogin)
//            startActivity(new Intent(this, LoginActivity.class));
//    }
}
