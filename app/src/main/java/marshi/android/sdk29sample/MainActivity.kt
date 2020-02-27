package marshi.android.sdk29sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import androidx.databinding.DataBindingUtil
import marshi.android.sdk29sample.databinding.ActivityMainBinding
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.appDirButton.setOnClickListener {
            val externalFilesDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
            val file = File(externalFilesDir, "filename.jpg")
            file.createNewFile()
            file.inputStream()
        }

        binding.appPublicDirButton.setOnClickListener {
            val externalFilesDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
            val file = File(externalFilesDir, "filename.jpg")
            file.createNewFile()
            file.inputStream()
        }
    }
}
