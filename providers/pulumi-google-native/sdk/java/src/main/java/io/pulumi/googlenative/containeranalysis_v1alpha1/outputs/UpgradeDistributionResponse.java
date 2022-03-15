// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class UpgradeDistributionResponse {
    /**
     * The operating system classification of this Upgrade, as specified by the upstream operating system upgrade feed.
     * 
     */
    private final String classification;
    /**
     * Required - The specific operating system this metadata applies to. See https://cpe.mitre.org/specification/.
     * 
     */
    private final String cpeUri;
    /**
     * The cve that would be resolved by this upgrade.
     * 
     */
    private final List<String> cve;
    /**
     * The severity as specified by the upstream operating system.
     * 
     */
    private final String severity;

    @CustomType.Constructor
    private UpgradeDistributionResponse(
        @CustomType.Parameter("classification") String classification,
        @CustomType.Parameter("cpeUri") String cpeUri,
        @CustomType.Parameter("cve") List<String> cve,
        @CustomType.Parameter("severity") String severity) {
        this.classification = classification;
        this.cpeUri = cpeUri;
        this.cve = cve;
        this.severity = severity;
    }

    /**
     * The operating system classification of this Upgrade, as specified by the upstream operating system upgrade feed.
     * 
    */
    public String getClassification() {
        return this.classification;
    }
    /**
     * Required - The specific operating system this metadata applies to. See https://cpe.mitre.org/specification/.
     * 
    */
    public String getCpeUri() {
        return this.cpeUri;
    }
    /**
     * The cve that would be resolved by this upgrade.
     * 
    */
    public List<String> getCve() {
        return this.cve;
    }
    /**
     * The severity as specified by the upstream operating system.
     * 
    */
    public String getSeverity() {
        return this.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeDistributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String classification;
        private String cpeUri;
        private List<String> cve;
        private String severity;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeDistributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.cpeUri = defaults.cpeUri;
    	      this.cve = defaults.cve;
    	      this.severity = defaults.severity;
        }

        public Builder classification(String classification) {
            this.classification = Objects.requireNonNull(classification);
            return this;
        }

        public Builder cpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }

        public Builder cve(List<String> cve) {
            this.cve = Objects.requireNonNull(cve);
            return this;
        }

        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public UpgradeDistributionResponse build() {
            return new UpgradeDistributionResponse(classification, cpeUri, cve, severity);
        }
    }
}
