// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.VulnerabilityLocationResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PackageIssueResponse {
    /**
     * The location of the vulnerability.
     * 
     */
    private final VulnerabilityLocationResponse affectedLocation;
    /**
     * The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when it is not available.
     * 
     */
    private final String effectiveSeverity;
    /**
     * The location of the available fix for vulnerability.
     * 
     */
    private final VulnerabilityLocationResponse fixedLocation;
    /**
     * The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    private final String packageType;

    @CustomType.Constructor
    private PackageIssueResponse(
        @CustomType.Parameter("affectedLocation") VulnerabilityLocationResponse affectedLocation,
        @CustomType.Parameter("effectiveSeverity") String effectiveSeverity,
        @CustomType.Parameter("fixedLocation") VulnerabilityLocationResponse fixedLocation,
        @CustomType.Parameter("packageType") String packageType) {
        this.affectedLocation = affectedLocation;
        this.effectiveSeverity = effectiveSeverity;
        this.fixedLocation = fixedLocation;
        this.packageType = packageType;
    }

    /**
     * The location of the vulnerability.
     * 
    */
    public VulnerabilityLocationResponse getAffectedLocation() {
        return this.affectedLocation;
    }
    /**
     * The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when it is not available.
     * 
    */
    public String getEffectiveSeverity() {
        return this.effectiveSeverity;
    }
    /**
     * The location of the available fix for vulnerability.
     * 
    */
    public VulnerabilityLocationResponse getFixedLocation() {
        return this.fixedLocation;
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
        private VulnerabilityLocationResponse affectedLocation;
        private String effectiveSeverity;
        private VulnerabilityLocationResponse fixedLocation;
        private String packageType;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageIssueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedLocation = defaults.affectedLocation;
    	      this.effectiveSeverity = defaults.effectiveSeverity;
    	      this.fixedLocation = defaults.fixedLocation;
    	      this.packageType = defaults.packageType;
        }

        public Builder affectedLocation(VulnerabilityLocationResponse affectedLocation) {
            this.affectedLocation = Objects.requireNonNull(affectedLocation);
            return this;
        }

        public Builder effectiveSeverity(String effectiveSeverity) {
            this.effectiveSeverity = Objects.requireNonNull(effectiveSeverity);
            return this;
        }

        public Builder fixedLocation(VulnerabilityLocationResponse fixedLocation) {
            this.fixedLocation = Objects.requireNonNull(fixedLocation);
            return this;
        }

        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }
        public PackageIssueResponse build() {
            return new PackageIssueResponse(affectedLocation, effectiveSeverity, fixedLocation, packageType);
        }
    }
}
