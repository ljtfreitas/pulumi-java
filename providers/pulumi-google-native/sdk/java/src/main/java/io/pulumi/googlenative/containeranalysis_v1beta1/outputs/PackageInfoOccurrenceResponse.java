// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.LicenseResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
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

    @OutputCustomType.Constructor({"comment","filename","homePage","licenseConcluded","packageType","sourceInfo","summaryDescription","title","version"})
    private PackageInfoOccurrenceResponse(
        String comment,
        String filename,
        String homePage,
        LicenseResponse licenseConcluded,
        String packageType,
        String sourceInfo,
        String summaryDescription,
        String title,
        String version) {
        this.comment = Objects.requireNonNull(comment);
        this.filename = Objects.requireNonNull(filename);
        this.homePage = Objects.requireNonNull(homePage);
        this.licenseConcluded = Objects.requireNonNull(licenseConcluded);
        this.packageType = Objects.requireNonNull(packageType);
        this.sourceInfo = Objects.requireNonNull(sourceInfo);
        this.summaryDescription = Objects.requireNonNull(summaryDescription);
        this.title = Objects.requireNonNull(title);
        this.version = Objects.requireNonNull(version);
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

        public Builder setComment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }

        public Builder setFilename(String filename) {
            this.filename = Objects.requireNonNull(filename);
            return this;
        }

        public Builder setHomePage(String homePage) {
            this.homePage = Objects.requireNonNull(homePage);
            return this;
        }

        public Builder setLicenseConcluded(LicenseResponse licenseConcluded) {
            this.licenseConcluded = Objects.requireNonNull(licenseConcluded);
            return this;
        }

        public Builder setPackageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }

        public Builder setSourceInfo(String sourceInfo) {
            this.sourceInfo = Objects.requireNonNull(sourceInfo);
            return this;
        }

        public Builder setSummaryDescription(String summaryDescription) {
            this.summaryDescription = Objects.requireNonNull(summaryDescription);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public PackageInfoOccurrenceResponse build() {
            return new PackageInfoOccurrenceResponse(comment, filename, homePage, licenseConcluded, packageType, sourceInfo, summaryDescription, title, version);
        }
    }
}
