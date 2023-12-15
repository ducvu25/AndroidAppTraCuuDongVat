package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    //String[] list = {"Hổ", "Mèo", "Cá", "Chim", "Cá sấu", "Hươu"};
    ArrayList<Animal>[] list;
    ArrayList<String> list2;

        String[] types = {"Trên mặt đất", "Trong nước", "Trên bầu trời"};

        ImageView imgView;
        TextView txtInformation, txtType;
        Intent intent;
        TextInputLayout textField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        ((MaterialAutoCompleteTextView) textField.getEditText()).setSimpleItems(list2.toArray(new String[list2.size()]));
        MaterialAutoCompleteTextView autoCompleteTextView = (MaterialAutoCompleteTextView) textField.getEditText();

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int p, long id) {
                String value = ((AutoCompleteTextView) findViewById(R.id.txtView2)).getText().toString();
                int position = list2.indexOf(value);//Arrays.asList(list).indexOf(value);
                int imageId = list[intent.getIntExtra(F2.keyF2, 0)].get(position).getImg();// listImg[position];
                String information = list[intent.getIntExtra(F2.keyF2, 0)].get(position).getInformation();//listInformation[position];

                // Hiển thị ảnh và thông tin
                imgView.setImageResource(imageId);
                txtInformation.setText(information);
            }
        });
        findViewById(R.id.F3btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, F2.class);
                startActivity(i);
            }
        });
    }
    void addItem(int type, Animal x ){
        list[type].add(x);
    }
    void init(){
        list = new ArrayList[3];
        for (int i = 0; i < 3; i++) {
            list[i] = new ArrayList<>();
        }
        list2 = new ArrayList<>();

        list[0].add(new Animal("Hổ", "Hổ là một trong những loài động vật hoang dã mạnh mẽ và quý hiếm trên hành tinh. Với vẻ ngoài mạnh mẽ và cơ bắp săn chắc, hổ thuộc họ mèo và là loài động vật săn mồi cấp cao nhất trong hệ sinh thái rừng rậm. Chúng có thể đạt tốc độ chạy lên đến 60 km/h trong khoảng thời gian ngắn và nhảy xa tới 6-7 mét.\n" +
                "Hổ được biết đến với bộ lông màu cam và đốm đen trên cơ thể, tạo nên một hình ảnh đặc trưng và quyến rũ. Đốm đen trên lông của hổ có thể khác nhau tùy thuộc vào từng cá thể, giúp chúng lẩn trốn trong môi trường tự nhiên và tấn công mục tiêu một cách bất ngờ. Bên cạnh đó, hổ cũng có một chiếc răng nanh sắc nhọn và móng vuốt mạnh mẽ giúp chúng săn mồi và chiến đấu.\n" +
                "Hổ sống trong các vùng rừng rậm và đầm lầy ở châu Á, chủ yếu là ở Ấn Độ, Nga, Trung Quốc và Đông Nam Á. Tuy nhiên, do săn bắn và mất môi trường sống, hổ đã trở thành một loài bị đe dọa và được liệt vào danh sách các loài động vật có nguy cơ tuyệt chủng. Hiện nay, chỉ còn khoảng 4.000-4.500 cá thể hổ hoang dã còn sống trên thế giới.\n" +
                "Việc bảo vệ và bảo tồn loài hổ trở thành một ưu tiên hàng đầu. Nhiều tổ chức và cơ quan quốc tế đã đưa ra các chương trình bảo vệ môi trường và giảm săn bắn bất hợp pháp để bảo vệ loài hổ. Sự nỗ lực này nhằm đảm bảo rằng hổ và những loài động vật hoang dã khác sẽ tiếp tục tồn tại và phát triển trong tương lai.\n" +
                "Hổ không chỉ là biểu tượng của sức mạnh và uy quyền trong văn hóa và truyền thuyết, mà còn đóng vai trò quan trọng trong du lịch và giáo dục môi trường. Sự tôn trọng và bảo vệ loài hổ không chỉ giúp bảo tồn một loài động vật quý hiếm mà còn đóng góp vào sự cân bằng và đa dạng sinh học của hành tinh chúng ta.", R.drawable.img_ho));

        list[0].add(new Animal("Mèo", "Mèo là một loài động vật có nguồn gốc từ tự nhiên và đã được thuần hóa hàng nghìn năm trước đây. Loài mèo thuộc họ mèo (Felidae) và là thành viên của họng (Felis catus) trong phân loài của chúng. Mèo đã trở thành một trong những động vật cảnh quan phổ biến và được nuôi nhốt trên toàn thế giới.\n" +
                "Mèo có một bộ lông mềm mịn và đa dạng, với nhiều màu sắc và hoa văn khác nhau. Chúng có cơ thể nhỏ gọn và linh hoạt, với đôi tai nhọn, mũi nhọn và móng vuốt sắc nhọn. Mèo cũng có khả năng nghe tốt và tầm nhìn tốt trong bóng tối, giúp chúng trở thành những thợ săn tài ba.\n" +
                "Mèo là loài động vật rất linh hoạt và thích nghi. Chúng có khả năng leo trèo, nhảy cao và di chuyển nhanh. Mèo là động vật vạn năng, có thể sống trong môi trường khác nhau như nhà cửa, công viên hay nông trại. Đặc điểm đáng chú ý khác của mèo là khả năng tự vệ bằng cách móc móc và cắn.\n" +
                "Mèo là loài động vật xã hội và có tính cách đa dạng. Một số mèo thích gần gũi và tình cảm với con người, trong khi những con khác có thể ít quan tâm và độc lập hơn. Mèo cũng có khả năng tạo mối quan hệ xã hội với những con mèo khác và có thể hình thành các nhóm xã hội nhỏ.\n" +
                "Ngày nay, mèo không chỉ được nuôi làm vật cảnh mà còn là bạn đồng hành và thành viên của gia đình trong nhiều hộ gia đình trên thế giới. Chúng được yêu thích vì tính cách đáng yêu, khả năng giảm stress và khả năng săn bắt các loài gây hại khác trong nhà. Mèo cũng được coi là một biểu tượng của sự độc lập và sự tự tin.\n", R.drawable.img_meo));

        list[1].add(new Animal("Cá", "Cá là một nhóm động vật thủy sinh có hàm lượng oxy hòa tan trong nước và có vảy trên cơ thể. Chúng thuộc lớp cá (Pisces) trong ngành động vật. Cá xuất hiện trong hầu hết các môi trường nước, bao gồm đại dương, biển, hồ, sông và ao.\n" +
                "Cá có hình dạng và kích thước đa dạng. Một số cá có cơ thể dẹp bên và bơi bằng cách di chuyển đuôi từ phía trước sang phía sau, trong khi những loại cá khác có cơ thể hình trụ và bơi bằng cách dao động lưng. Chúng có vảy trên da để bảo vệ và giúp giảm ma sát khi di chuyển trong nước. Cá có các vây để điều chỉnh hướng di chuyển và giữ thăng bằng.\n" +
                "Cá có khả năng hít oxy qua các mang, vây hoặc lấy oxy từ nước bằng cách sử dụng các cơ quan thụ tinh như lá mang hoặc da. Hầu hết các loài cá đều có cặp mắt phát triển tốt để nhìn thấy trong môi trường nước. Một số cá còn có khả năng sử dụng các cơ quan cảm giác khác như màng nhĩ và vòi để phát hiện mồi hoặc cảm nhận môi trường xung quanh.\n" +
                "Cá có vai trò quan trọng trong hệ sinh thái nước ngọt và biển. Chúng là nguồn thực phẩm quan trọng cho con người và các loài động vật khác. Ngoài ra, cá cũng đóng vai trò quan trọng trong việc duy trì sự cân bằng sinh thái bằng cách kiểm soát dân số các loài sinh vật khác và làm nguồn thức ăn cho các loài cá săn mồi khác.\n" +
                "Tuy nhiên, các hoạt động con người như đánh bắt quá mức, ô nhiễm môi trường và mất môi trường sống đã gây ra sự suy giảm đáng kể về số lượng cá trong tự nhiên. Để bảo vệ và duy trì các loài cá, việc quản lý bền vững và bảo tồn môi trường nước là rất quan trọng.\n", R.drawable.img_ca));

        list[2].add(new Animal("Chim", "Chim là một nhóm động vật đa dạng và phổ biến trên khắp hành tinh. Chúng có khả năng bay và xây tổ. Chim có cấu trúc xương nhẹ, lớp lông phủ bên ngoài cơ thể và mỏ hình dạng đa dạng. Mỗi loài chim có tiếng hót riêng, và chúng sử dụng âm thanh để giao tiếp và thu hút bạn tình. Chúng có thể sống trong nhiều môi trường khác nhau, bao gồm rừng, sa mạc, núi, và đồng cỏ. Ngoài việc mang lại" +
                " âm thanh và sự đa dạng cho môi trường tự nhiên, chim còn có vai trò quan trọng trong việc phân tán hạt giống.", R.drawable.img_chim));

        list[0].add(new Animal("Cá sấu", "Cá sấu là một loại bò sát sống trong môi trường nước ngọt như sông, hồ và đầm lầy. Chúng có cấu trúc cơ thể rắn chắc, da vảy bảo vệ và hàm răng sắc nhọn. Cá sấu là những kẻ săn mồi khá đáng sợ, thường tấn công bất ngờ từ dưới nước để săn bắt các loài động vật lớn hơn. Tuy nhiên, cá sấu hiện đang đối mặt với nguy cơ bị đe dọa do mất môi trường sống và săn bắn bất hợp pháp.", R.drawable.img_ca_sau));
        list[0].add(new Animal("Hươu", "Hươu là một nhóm động vật thuộc họ hươu và có các loài phân bố trên toàn thế giới. Chúng có cơ thể cao, chân dài và sừng phát triển trên đầu. Hươu sống chủ yếu trong rừng và thảo nguyên, thích ăn cỏ và các loại cây non. Đối với các loài hươu nam, sừng thường phát triển lớn hơn và được sử dụng để thi đấu và tranh đấu với các đối thủ khác " +
                "trong mùa sinh sản. Hươu cũng có vai trò quan trọng trong việc phân tán hạt giống và duy trì cân bằng sinh thái trong môi trường tự nhiên.", R.drawable.img_huou));

        imgView = findViewById(R.id.imgVieww);
        txtInformation = findViewById(R.id.txtInformation);
        txtType = findViewById(R.id.F3txtType);

        intent = getIntent();
        txtType.setText(types[intent.getIntExtra(F2.keyF2, 0)]);

        textField = findViewById(R.id.txtInputField);

        for(int i=0; i<list[intent.getIntExtra(F2.keyF2, 0)].size(); i++)
            list2.add(list[intent.getIntExtra(F2.keyF2, 0)].get(i).name);
    }
}