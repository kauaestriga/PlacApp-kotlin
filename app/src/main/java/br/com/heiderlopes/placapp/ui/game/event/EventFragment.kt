package br.com.heiderlopes.placapp.ui.game.event

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.localbroadcastmanager.content.LocalBroadcastManager

import br.com.heiderlopes.placapp.R
import br.com.heiderlopes.placapp.ui.game.hometeam.HomeTeamFragment
import kotlinx.android.synthetic.main.fragment_event.*

class EventFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_event, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btNextStep.setOnClickListener {
            nextScreen()
        }
    }

    private fun sendEventName() {
        val intent = Intent("FILTER_EVENT")
        intent.putExtra("event_name", inputEvent.text.toString())
        LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)
    }


    private fun nextScreen() {
        sendEventName()
    }
}
