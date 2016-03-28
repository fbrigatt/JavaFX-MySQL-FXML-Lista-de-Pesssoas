package com.java.fxml.view;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;

import javafx.scene.control.ListView;

import javafx.scene.control.TextArea;

import javafx.scene.control.CheckBox;

import javafx.scene.control.TableColumn;

import javafx.scene.control.ToggleGroup;

import javafx.scene.control.ComboBox;

import javafx.scene.control.RadioButton;

import javafx.scene.image.ImageView;

import javafx.scene.control.DatePicker;

import javafx.scene.control.TableView;

public class CRUD_PessoaController {
	@FXML
	private TextField tfPesquisaTabela;
	@FXML
	private Button btnLogout;
	@FXML
	private Label lbPessoa;
	@FXML
	private TextField tfID;
	@FXML
	private TextField tfNome;
	@FXML
	private TextField tfSobrenome;
	@FXML
	private TextField tfEmail;
	@FXML
	private TextField tfUsername;
	@FXML
	private TextField tfPassword;
	@FXML
	private TextField tfTelefone;
	@FXML
	private DatePicker dpAniversario;
	@FXML
	private Button btnPesquisarImagem;
	@FXML
	private Button btnSalvar;
	@FXML
	private Button btnExibir;
	@FXML
	private Button btnExcluir;
	@FXML
	private Button btnAtualizar;
	@FXML
	private ComboBox cbNomes;
	@FXML
	private RadioButton rbHomem;
	@FXML
	private ToggleGroup tgSexo;
	@FXML
	private RadioButton rbMulher;
	@FXML
	private ListView lvNomes;
	@FXML
	private ImageView imageView;
	@FXML
	private CheckBox cb1;
	@FXML
	private CheckBox cb2;
	@FXML
	private CheckBox cb3;
	@FXML
	private TableView table;
	@FXML
	private TableColumn tbclID;
	@FXML
	private TableColumn tbclNome;
	@FXML
	private TableColumn tbclSobrenome;
	@FXML
	private TableColumn tbclEmail;
	@FXML
	private TableColumn tbclUsername;
	@FXML
	private TableColumn tbclPassword;
	@FXML
	private TableColumn tbclTelefone;
	@FXML
	private TableColumn tbclAniversario;
	@FXML
	private TableColumn tbclSexo;
	@FXML
	private TableColumn tbclHobbies;
	@FXML
	private TextArea textArea;

}
