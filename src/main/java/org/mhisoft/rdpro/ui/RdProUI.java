/*
 * Copyright (c) 2014- MHISoft LLC and/or its affiliates. All rights reserved.
 * Licensed to MHISoft LLC under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. MHISoft LLC licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.mhisoft.rdpro.ui;

import org.mhisoft.rdpro.FileRemoveStatistics;
import org.mhisoft.rdpro.RdProRunTimeProperties;

/**
 * Description: The RdPro User Interface
 *
 * @author Tony Xue
 * @since Nov, 2014
 */
public interface RdProUI {

	public static final String version = "v1.3.12";
	public static final String build = "01 July 2020";

	public void printBuildAndDisclaimer();

	/**
	 * log th emessage
	 * @param msg
	 */
	void print(String msg);

	/**
	 * log the msg
	 * @param msg
	 */
	void println(String msg);

	public  void printf(final String msg, Object args);

	/**
	 * Present a confirmation and return true if confirmed.
	 * @param question
	 * @return
	 */
	public  boolean isAnswerY(String question);

	/**
	 * Display help
	 */
	public  void help();

	public void dumpArguments(String[] args, RdProRunTimeProperties props);


	/**
	 * Parse the arguments passed to the program
	 * @param args
	 * @return
	 */
	public RdProRunTimeProperties parseCommandLineArguments(String[] args);


	/**
	 * Get a confirmation to the question.
	 * @param question
	 * @param options
	 * @return
	 */
	public Confirmation getConfirmation(String question, Confirmation... options);

	
	public void reportStatus(FileRemoveStatistics frs);
}
