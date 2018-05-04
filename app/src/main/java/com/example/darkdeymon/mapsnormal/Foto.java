package com.example.darkdeymon.mapsnormal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Foto extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);

        imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(this).load("https://lh3.googleusercontent.com/38x4mLO9f5oBRMUHMYYIhOUd4yTLhqqADw_UA59opdPTAzUAQlqKSqiKwWcmRj31J5EtbIAuiy1k6ycgxnaq4dOmybsxrbzeKuBlF0zL6D2LZBX29yJVkIOYQWiAnLXpbsjP-5hpWDT2kbVk_-d9VG0sqT-LmAcY4FQYV4zb9oO0R0cjTd1__K1bJaAmSm-0MfWSDhOyAmgTb2JoNthI8ozeBQ3qSpzy10oxpnNFCK61LpXg1sqb9zEuSUq8_OEgCLzuTEnJ0LDclKe17vHrOPb3rshqpfqwElVQBOyN8RQE30PbPCsqADR4LvNQGSX33yP-0wi9HnNNdGy0QaNzAH6RnmXwgvVcjN0Ukh8jZGUuKMFpPKr2pUTfdOPM3A9ZWcNyKCZU8GWHzpfspA3ahSGQISp77Hl5o5ehs2n_VxjxCsAFPxzAY0h41jldYaEUE0e3jDnuh_-v14pZkVnsehYhYoasfVw5sLnB1dTe0CdC6YjxsyQ6Dir3gGOpFnBeqbwDVEw5TdRJ4ulBhh5xb19qHmzkBCGuf3gS7A8EI1S3ksz4CZXPbkj7VXSN6OutTh_Ddb9BPsIkYuNDdT86MRPtQaIb7rdJv6GT5M4=w660-h330-no")
                .placeholder(R.drawable.ic_cached_black_24dp)
                .error(R.drawable.ic_error_black_24dp)
                .into(imageView);
    }
}
