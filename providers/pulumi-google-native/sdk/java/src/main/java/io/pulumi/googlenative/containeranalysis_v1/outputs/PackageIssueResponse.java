// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.VersionResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PackageIssueResponse {
    /**
     * The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability was found in.
     * 
     */
    private final String affectedCpeUri;
    /**
     * The package this vulnerability was found in.
     * 
     */
    private final String affectedPackage;
    /**
     * The version of the package that is installed on the resource affected by this vulnerability.
     * 
     */
    private final VersionResponse affectedVersion;
    /**
     * The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when it is not available.
     * 
     */
    private final String effectiveSeverity;
    /**
     * Whether a fix is available for this package.
     * 
     */
    private final Boolean fixAvailable;
    /**
     * The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability was fixed in. It is possible for this to be different from the affected_cpe_uri.
     * 
     */
    private final String fixedCpeUri;
    /**
     * The package this vulnerability was fixed in. It is possible for this to be different from the affected_package.
     * 
     */
    private final String fixedPackage;
    /**
     * The version of the package this vulnerability was fixed in. Setting this to VersionKind.MAXIMUM means no fix is yet available.
     * 
     */
    private final VersionResponse fixedVersion;
    /**
     * The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    private final String packageType;

    @CustomType.Constructor
    private PackageIssueResponse(
        @CustomType.Parameter("affectedCpeUri") String affectedCpeUri,
        @CustomType.Parameter("affectedPackage") String affectedPackage,
        @CustomType.Parameter("affectedVersion") VersionResponse affectedVersion,
        @CustomType.Parameter("effectiveSeverity") String effectiveSeverity,
        @CustomType.Parameter("fixAvailable") Boolean fixAvailable,
        @CustomType.Parameter("fixedCpeUri") String fixedCpeUri,
        @CustomType.Parameter("fixedPackage") String fixedPackage,
        @CustomType.Parameter("fixedVersion") VersionResponse fixedVersion,
        @CustomType.Parameter("packageType") String packageType) {
        this.affectedCpeUri = affectedCpeUri;
        this.affectedPackage = affectedPackage;
        this.affectedVersion = affectedVersion;
        this.effectiveSeverity = effectiveSeverity;
        this.fixAvailable = fixAvailable;
        this.fixedCpeUri = fixedCpeUri;
        this.fixedPackage = fixedPackage;
        this.fixedVersion = fixedVersion;
        this.packageType = packageType;
    }

    /**
     * The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability was found in.
     * 
    */
    public String getAffectedCpeUri() {
        return this.affectedCpeUri;
    }
    /**
     * The package this vulnerability was found in.
     * 
    */
    public String getAffectedPackage() {
        return this.affectedPackage;
    }
    /**
     * The version of the package that is installed on the resource affected by this vulnerability.
     * 
    */
    public VersionResponse getAffectedVersion() {
        return this.affectedVersion;
    }
    /**
     * The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when it is not available.
     * 
    */
    public String getEffectiveSeverity() {
        return this.effectiveSeverity;
    }
    /**
     * Whether a fix is available for this package.
     * 
    */
    public Boolean getFixAvailable() {
        return this.fixAvailable;
    }
    /**
     * The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability was fixed in. It is possible for this to be different from the affected_cpe_uri.
     * 
    */
    public String getFixedCpeUri() {
        return this.fixedCpeUri;
    }
    /**
     * The package this vulnerability was fixed in. It is possible for this to be different from the affected_package.
     * 
    */
    public String getFixedPackage() {
        return this.fixedPackage;
    }
    /**
     * The version of the package this vulnerability was fixed in. Setting this to VersionKind.MAXIMUM means no fix is yet available.
     * 
    */
    public VersionResponse getFixedVersion() {
        return this.fixedVersion;
    }
    /**
     * The type of package (e.g. OS, MAVEN, GO).
     * 
    */
    public String getPackageType() {
        return this.packageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageIssueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String affectedCpeUri;
        private String affectedPackage;
        private VersionResponse affectedVersion;
        private String effectiveSeverity;
        private Boolean fixAvailable;
        private String fixedCpeUri;
        private String fixedPackage;
        private VersionResponse fixedVersion;
        private String packageType;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageIssueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedCpeUri = defaults.affectedCpeUri;
    	      this.affectedPackage = defaults.affectedPackage;
    	      this.affectedVersion = defaults.affectedVersion;
    	      this.effectiveSeverity = defaults.effectiveSeverity;
    	      this.fixAvailable = defaults.fixAvailable;
    	      this.fixedCpeUri = defaults.fixedCpeUri;
    	      this.fixedPackage = defaults.fixedPackage;
    	      this.fixedVersion = defaults.fixedVersion;
    	      this.packageType = defaults.packageType;
        }

        public Builder affectedCpeUri(String affectedCpeUri) {
            this.affectedCpeUri = Objects.requireNonNull(affectedCpeUri);
            return this;
        }

        public Builder affectedPackage(String affectedPackage) {
            this.affectedPackage = Objects.requireNonNull(affectedPackage);
            return this;
        }

        public Builder affectedVersion(VersionResponse affectedVersion) {
            this.affectedVersion = Objects.requireNonNull(affectedVersion);
            return this;
        }

        public Builder effectiveSeverity(String effectiveSeverity) {
            this.effectiveSeverity = Objects.requireNonNull(effectiveSeverity);
            return this;
        }

        public Builder fixAvailable(Boolean fixAvailable) {
            this.fixAvailable = Objects.requireNonNull(fixAvailable);
            return this;
        }

        public Builder fixedCpeUri(String fixedCpeUri) {
            this.fixedCpeUri = Objects.requireNonNull(fixedCpeUri);
            return this;
        }

        public Builder fixedPackage(String fixedPackage) {
            this.fixedPackage = Objects.requireNonNull(fixedPackage);
            return this;
        }

        public Builder fixedVersion(VersionResponse fixedVersion) {
            this.fixedVersion = Objects.requireNonNull(fixedVersion);
            return this;
        }

        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }
        public PackageIssueResponse build() {
            return new PackageIssueResponse(affectedCpeUri, affectedPackage, affectedVersion, effectiveSeverity, fixAvailable, fixedCpeUri, fixedPackage, fixedVersion, packageType);
        }
    }
}
