// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.LicenseResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PackageInfoOccurrenceResponse {
    /**
     * A place for the SPDX file creator to record any general comments about the package being described
     * 
     */
    private final String comment;
    /**
     * Provide the actual file name of the package, or path of the directory being treated as a package
     * 
     */
    private final String filename;
    /**
     * Provide a place for the SPDX file creator to record a web site that serves as the package's home page
     * 
     */
    private final String homePage;
    /**
     * package or alternative values, if the governing license cannot be determined
     * 
     */
    private final LicenseResponse licenseConcluded;
    /**
     * The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
     * 
     */
    private final String packageType;
    /**
     * Provide a place for the SPDX file creator to record any relevant background information or additional comments about the origin of the package
     * 
     */
    private final String sourceInfo;
    /**
     * A short description of the package
     * 
     */
    private final String summaryDescription;
    /**
     * Identify the full name of the package as given by the Package Originator
     * 
     */
    private final String title;
    /**
     * Identify the version of the package
     * 
     */
    private final String version;

    @CustomType.Constructor
    private PackageInfoOccurrenceResponse(
        @CustomType.Parameter("comment") String comment,
        @CustomType.Parameter("filename") String filename,
        @CustomType.Parameter("homePage") String homePage,
        @CustomType.Parameter("licenseConcluded") LicenseResponse licenseConcluded,
        @CustomType.Parameter("packageType") String packageType,
        @CustomType.Parameter("sourceInfo") String sourceInfo,
        @CustomType.Parameter("summaryDescription") String summaryDescription,
        @CustomType.Parameter("title") String title,
        @CustomType.Parameter("version") String version) {
        this.comment = comment;
        this.filename = filename;
        this.homePage = homePage;
        this.licenseConcluded = licenseConcluded;
        this.packageType = packageType;
        this.sourceInfo = sourceInfo;
        this.summaryDescription = summaryDescription;
        this.title = title;
        this.version = version;
    }

    /**
     * A place for the SPDX file creator to record any general comments about the package being described
     * 
    */
    public String getComment() {
        return this.comment;
    }
    /**
     * Provide the actual file name of the package, or path of the directory being treated as a package
     * 
    */
    public String getFilename() {
        return this.filename;
    }
    /**
     * Provide a place for the SPDX file creator to record a web site that serves as the package's home page
     * 
    */
    public String getHomePage() {
        return this.homePage;
    }
    /**
     * package or alternative values, if the governing license cannot be determined
     * 
    */
    public LicenseResponse getLicenseConcluded() {
        return this.licenseConcluded;
    }
    /**
     * The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
     * 
    */
    public String getPackageType() {
        return this.packageType;
    }
    /**
     * Provide a place for the SPDX file creator to record any relevant background information or additional comments about the origin of the package
     * 
    */
    public String getSourceInfo() {
        return this.sourceInfo;
    }
    /**
     * A short description of the package
     * 
    */
    public String getSummaryDescription() {
        return this.summaryDescription;
    }
    /**
     * Identify the full name of the package as given by the Package Originator
     * 
    */
    public String getTitle() {
        return this.title;
    }
    /**
     * Identify the version of the package
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageInfoOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comment;
        private String filename;
        private String homePage;
        private LicenseResponse licenseConcluded;
        private String packageType;
        private String sourceInfo;
        private String summaryDescription;
        private String title;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageInfoOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.filename = defaults.filename;
    	      this.homePage = defaults.homePage;
    	      this.licenseConcluded = defaults.licenseConcluded;
    	      this.packageType = defaults.packageType;
    	      this.sourceInfo = defaults.sourceInfo;
    	      this.summaryDescription = defaults.summaryDescription;
    	      this.title = defaults.title;
    	      this.version = defaults.version;
        }

        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }

        public Builder filename(String filename) {
            this.filename = Objects.requireNonNull(filename);
            return this;
        }

        public Builder homePage(String homePage) {
            this.homePage = Objects.requireNonNull(homePage);
            return this;
        }

        public Builder licenseConcluded(LicenseResponse licenseConcluded) {
            this.licenseConcluded = Objects.requireNonNull(licenseConcluded);
            return this;
        }

        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }

        public Builder sourceInfo(String sourceInfo) {
            this.sourceInfo = Objects.requireNonNull(sourceInfo);
            return this;
        }

        public Builder summaryDescription(String summaryDescription) {
            this.summaryDescription = Objects.requireNonNull(summaryDescription);
            return this;
        }

        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public PackageInfoOccurrenceResponse build() {
            return new PackageInfoOccurrenceResponse(comment, filename, homePage, licenseConcluded, packageType, sourceInfo, summaryDescription, title, version);
        }
    }
}
