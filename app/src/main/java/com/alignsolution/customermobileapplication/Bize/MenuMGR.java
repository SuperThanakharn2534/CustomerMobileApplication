package com.alignsolution.customermobileapplication.Bize;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.alignsolution.customermobileapplication.ClaimPolicyListActivity;
import com.alignsolution.customermobileapplication.ComplainAcitivity;
import com.alignsolution.customermobileapplication.LoginActivity;
import com.alignsolution.customermobileapplication.OtherMenuActivity;
import com.alignsolution.customermobileapplication.PayCustomerAcitivity;
import com.alignsolution.customermobileapplication.PolicyListActivity;
import com.alignsolution.customermobileapplication.ProductPromotionListActivity;
import com.alignsolution.customermobileapplication.UserProfileEditActivity;


/**
 * Created by aligndev on 4/4/2017.
 */



public class MenuMGR extends AppCompatActivity {


    private Intent myIntent;
      public  void  CustomerMenuSelect(int position , Activity activity){



          switch (position)
          {
              case  0:
                  Toast.makeText(activity," ข้อมูลส่วนตัว ", Toast.LENGTH_SHORT).show();
                  myIntent =new Intent(activity,UserProfileEditActivity.class);
                  activity.startActivity(myIntent);
                  break;
              case 1:
                  Toast.makeText(activity," ข้อมูลกรมธรรม์ ", Toast.LENGTH_SHORT).show();
                  myIntent =new Intent(activity,PolicyListActivity.class);
                  activity.startActivity(myIntent);
                  break;

              case 2:
                  Toast.makeText(activity," ข้อมูลผลิตภัณฑ์ / โปรโมชั่น", Toast.LENGTH_SHORT).show();
                  myIntent =new Intent(activity,ProductPromotionListActivity.class);
                  activity.startActivity(myIntent);
                  break;
              case 3:
                  Toast.makeText(activity,"รับเรื่องสินไหม", Toast.LENGTH_SHORT).show();
                  myIntent =new Intent(activity,ClaimPolicyListActivity.class);
                  activity.startActivity(myIntent);
                  break;
              case 4:
                  Toast.makeText(activity," ชำระเบี้ย", Toast.LENGTH_SHORT).show();
                  myIntent =new Intent(activity,PayCustomerAcitivity.class);
                  activity.startActivity(myIntent);
                  break;
              case 5:
               Toast.makeText(activity,"ติดต่อสอบถามข้อมูลเพิ่มเติม", Toast.LENGTH_SHORT).show();
              myIntent =new Intent(activity,OtherMenuActivity.class);
              activity.startActivity(myIntent);
              break;

              case 6:
                  Toast.makeText(activity,"ข้อเสนอแนะ / ร้องเรียน", Toast.LENGTH_SHORT).show();
                  myIntent =new Intent(activity,ComplainAcitivity.class);
                  activity.startActivity(myIntent);
                  break;
              case 7:
                  Toast.makeText(activity," Log Out ", Toast.LENGTH_SHORT).show();
                  myIntent =new Intent(activity,LoginActivity.class);
                  activity.startActivity(myIntent);
                  break;

              default:
                  break;

          }

      }


}
