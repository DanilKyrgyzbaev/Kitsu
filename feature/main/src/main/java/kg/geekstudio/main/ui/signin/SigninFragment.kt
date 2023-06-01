package kg.geekstudio.main.ui.signin

import android.os.Bundle
import android.view.View
import kg.geekstudio.core_ui.base.BaseFragment
import kg.geekstudio.kitsu.main.databinding.FragmentSigninBinding
import androidx.fragment.app.viewModels
import kg.geekstudio.main.ui.viewPager.anime.AnimeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class SigninFragment : BaseFragment<SigninViewModel, FragmentSigninBinding>(FragmentSigninBinding::inflate) {

    override val viewModel by viewModel<SigninViewModel>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // viewModel.fetchAnime()
    }

}