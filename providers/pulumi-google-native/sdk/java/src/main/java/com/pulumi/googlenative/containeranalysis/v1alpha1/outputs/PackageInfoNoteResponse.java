// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1alpha1.outputs.ExternalRefResponse;
import com.pulumi.googlenative.containeranalysis.v1alpha1.outputs.LicenseResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PackageInfoNoteResponse {
    /**
     * @return Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document
     * 
     */
    private final Boolean analyzed;
    /**
     * @return A place for the SPDX data creator to record, at the package level, acknowledgements that may be needed to be communicated in some contexts
     * 
     */
    private final String attribution;
    /**
     * @return Provide an independently reproducible mechanism that permits unique identification of a specific package that correlates to the data in this SPDX file
     * 
     */
    private final String checksum;
    /**
     * @return Identify the copyright holders of the package, as well as any dates present
     * 
     */
    private final String copyright;
    /**
     * @return A more detailed description of the package
     * 
     */
    private final String detailedDescription;
    /**
     * @return This section identifies the download Universal Resource Locator (URL), or a specific location within a version control system (VCS) for the package at the time that the SPDX file was created
     * 
     */
    private final String downloadLocation;
    /**
     * @return ExternalRef
     * 
     */
    private final List<ExternalRefResponse> externalRefs;
    /**
     * @return Contain the license the SPDX file creator has concluded as governing the This field is to contain a list of all licenses found in the package. The relationship between licenses (i.e., conjunctive, disjunctive) is not specified in this field – it is simply a listing of all licenses found
     * 
     */
    private final List<String> filesLicenseInfo;
    /**
     * @return Provide a place for the SPDX file creator to record a web site that serves as the package&#39;s home page
     * 
     */
    private final String homePage;
    /**
     * @return List the licenses that have been declared by the authors of the package
     * 
     */
    private final LicenseResponse licenseDeclared;
    /**
     * @return If the package identified in the SPDX file originated from a different person or organization than identified as Package Supplier, this field identifies from where or whom the package originally came
     * 
     */
    private final String originator;
    /**
     * @return The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
     * 
     */
    private final String packageType;
    /**
     * @return A short description of the package
     * 
     */
    private final String summaryDescription;
    /**
     * @return Identify the actual distribution source for the package/directory identified in the SPDX file
     * 
     */
    private final String supplier;
    /**
     * @return Identify the full name of the package as given by the Package Originator
     * 
     */
    private final String title;
    /**
     * @return This field provides an independently reproducible mechanism identifying specific contents of a package based on the actual files (except the SPDX file itself, if it is included in the package) that make up each package and that correlates to the data in this SPDX file
     * 
     */
    private final String verificationCode;
    /**
     * @return Identify the version of the package
     * 
     */
    private final String version;

    @CustomType.Constructor
    private PackageInfoNoteResponse(
        @CustomType.Parameter("analyzed") Boolean analyzed,
        @CustomType.Parameter("attribution") String attribution,
        @CustomType.Parameter("checksum") String checksum,
        @CustomType.Parameter("copyright") String copyright,
        @CustomType.Parameter("detailedDescription") String detailedDescription,
        @CustomType.Parameter("downloadLocation") String downloadLocation,
        @CustomType.Parameter("externalRefs") List<ExternalRefResponse> externalRefs,
        @CustomType.Parameter("filesLicenseInfo") List<String> filesLicenseInfo,
        @CustomType.Parameter("homePage") String homePage,
        @CustomType.Parameter("licenseDeclared") LicenseResponse licenseDeclared,
        @CustomType.Parameter("originator") String originator,
        @CustomType.Parameter("packageType") String packageType,
        @CustomType.Parameter("summaryDescription") String summaryDescription,
        @CustomType.Parameter("supplier") String supplier,
        @CustomType.Parameter("title") String title,
        @CustomType.Parameter("verificationCode") String verificationCode,
        @CustomType.Parameter("version") String version) {
        this.analyzed = analyzed;
        this.attribution = attribution;
        this.checksum = checksum;
        this.copyright = copyright;
        this.detailedDescription = detailedDescription;
        this.downloadLocation = downloadLocation;
        this.externalRefs = externalRefs;
        this.filesLicenseInfo = filesLicenseInfo;
        this.homePage = homePage;
        this.licenseDeclared = licenseDeclared;
        this.originator = originator;
        this.packageType = packageType;
        this.summaryDescription = summaryDescription;
        this.supplier = supplier;
        this.title = title;
        this.verificationCode = verificationCode;
        this.version = version;
    }

    /**
     * @return Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document
     * 
     */
    public Boolean analyzed() {
        return this.analyzed;
    }
    /**
     * @return A place for the SPDX data creator to record, at the package level, acknowledgements that may be needed to be communicated in some contexts
     * 
     */
    public String attribution() {
        return this.attribution;
    }
    /**
     * @return Provide an independently reproducible mechanism that permits unique identification of a specific package that correlates to the data in this SPDX file
     * 
     */
    public String checksum() {
        return this.checksum;
    }
    /**
     * @return Identify the copyright holders of the package, as well as any dates present
     * 
     */
    public String copyright() {
        return this.copyright;
    }
    /**
     * @return A more detailed description of the package
     * 
     */
    public String detailedDescription() {
        return this.detailedDescription;
    }
    /**
     * @return This section identifies the download Universal Resource Locator (URL), or a specific location within a version control system (VCS) for the package at the time that the SPDX file was created
     * 
     */
    public String downloadLocation() {
        return this.downloadLocation;
    }
    /**
     * @return ExternalRef
     * 
     */
    public List<ExternalRefResponse> externalRefs() {
        return this.externalRefs;
    }
    /**
     * @return Contain the license the SPDX file creator has concluded as governing the This field is to contain a list of all licenses found in the package. The relationship between licenses (i.e., conjunctive, disjunctive) is not specified in this field – it is simply a listing of all licenses found
     * 
     */
    public List<String> filesLicenseInfo() {
        return this.filesLicenseInfo;
    }
    /**
     * @return Provide a place for the SPDX file creator to record a web site that serves as the package&#39;s home page
     * 
     */
    public String homePage() {
        return this.homePage;
    }
    /**
     * @return List the licenses that have been declared by the authors of the package
     * 
     */
    public LicenseResponse licenseDeclared() {
        return this.licenseDeclared;
    }
    /**
     * @return If the package identified in the SPDX file originated from a different person or organization than identified as Package Supplier, this field identifies from where or whom the package originally came
     * 
     */
    public String originator() {
        return this.originator;
    }
    /**
     * @return The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
     * 
     */
    public String packageType() {
        return this.packageType;
    }
    /**
     * @return A short description of the package
     * 
     */
    public String summaryDescription() {
        return this.summaryDescription;
    }
    /**
     * @return Identify the actual distribution source for the package/directory identified in the SPDX file
     * 
     */
    public String supplier() {
        return this.supplier;
    }
    /**
     * @return Identify the full name of the package as given by the Package Originator
     * 
     */
    public String title() {
        return this.title;
    }
    /**
     * @return This field provides an independently reproducible mechanism identifying specific contents of a package based on the actual files (except the SPDX file itself, if it is included in the package) that make up each package and that correlates to the data in this SPDX file
     * 
     */
    public String verificationCode() {
        return this.verificationCode;
    }
    /**
     * @return Identify the version of the package
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageInfoNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean analyzed;
        private String attribution;
        private String checksum;
        private String copyright;
        private String detailedDescription;
        private String downloadLocation;
        private List<ExternalRefResponse> externalRefs;
        private List<String> filesLicenseInfo;
        private String homePage;
        private LicenseResponse licenseDeclared;
        private String originator;
        private String packageType;
        private String summaryDescription;
        private String supplier;
        private String title;
        private String verificationCode;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageInfoNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzed = defaults.analyzed;
    	      this.attribution = defaults.attribution;
    	      this.checksum = defaults.checksum;
    	      this.copyright = defaults.copyright;
    	      this.detailedDescription = defaults.detailedDescription;
    	      this.downloadLocation = defaults.downloadLocation;
    	      this.externalRefs = defaults.externalRefs;
    	      this.filesLicenseInfo = defaults.filesLicenseInfo;
    	      this.homePage = defaults.homePage;
    	      this.licenseDeclared = defaults.licenseDeclared;
    	      this.originator = defaults.originator;
    	      this.packageType = defaults.packageType;
    	      this.summaryDescription = defaults.summaryDescription;
    	      this.supplier = defaults.supplier;
    	      this.title = defaults.title;
    	      this.verificationCode = defaults.verificationCode;
    	      this.version = defaults.version;
        }

        public Builder analyzed(Boolean analyzed) {
            this.analyzed = Objects.requireNonNull(analyzed);
            return this;
        }
        public Builder attribution(String attribution) {
            this.attribution = Objects.requireNonNull(attribution);
            return this;
        }
        public Builder checksum(String checksum) {
            this.checksum = Objects.requireNonNull(checksum);
            return this;
        }
        public Builder copyright(String copyright) {
            this.copyright = Objects.requireNonNull(copyright);
            return this;
        }
        public Builder detailedDescription(String detailedDescription) {
            this.detailedDescription = Objects.requireNonNull(detailedDescription);
            return this;
        }
        public Builder downloadLocation(String downloadLocation) {
            this.downloadLocation = Objects.requireNonNull(downloadLocation);
            return this;
        }
        public Builder externalRefs(List<ExternalRefResponse> externalRefs) {
            this.externalRefs = Objects.requireNonNull(externalRefs);
            return this;
        }
        public Builder externalRefs(ExternalRefResponse... externalRefs) {
            return externalRefs(List.of(externalRefs));
        }
        public Builder filesLicenseInfo(List<String> filesLicenseInfo) {
            this.filesLicenseInfo = Objects.requireNonNull(filesLicenseInfo);
            return this;
        }
        public Builder filesLicenseInfo(String... filesLicenseInfo) {
            return filesLicenseInfo(List.of(filesLicenseInfo));
        }
        public Builder homePage(String homePage) {
            this.homePage = Objects.requireNonNull(homePage);
            return this;
        }
        public Builder licenseDeclared(LicenseResponse licenseDeclared) {
            this.licenseDeclared = Objects.requireNonNull(licenseDeclared);
            return this;
        }
        public Builder originator(String originator) {
            this.originator = Objects.requireNonNull(originator);
            return this;
        }
        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }
        public Builder summaryDescription(String summaryDescription) {
            this.summaryDescription = Objects.requireNonNull(summaryDescription);
            return this;
        }
        public Builder supplier(String supplier) {
            this.supplier = Objects.requireNonNull(supplier);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder verificationCode(String verificationCode) {
            this.verificationCode = Objects.requireNonNull(verificationCode);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public PackageInfoNoteResponse build() {
            return new PackageInfoNoteResponse(analyzed, attribution, checksum, copyright, detailedDescription, downloadLocation, externalRefs, filesLicenseInfo, homePage, licenseDeclared, originator, packageType, summaryDescription, supplier, title, verificationCode, version);
        }
    }
}
