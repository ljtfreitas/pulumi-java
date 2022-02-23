// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class UpgradeDistributionResponse {
    /**
     * The operating system classification of this Upgrade, as specified by the upstream operating system upgrade feed. For Windows the classification is one of the category_ids listed at https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
     * 
     */
    private final String classification;
    /**
     * Required - The specific operating system this metadata applies to. See https://cpe.mitre.org/specification/.
     * 
     */
    private final String cpeUri;
    /**
     * The cve tied to this Upgrade.
     * 
     */
    private final List<String> cve;
    /**
     * The severity as specified by the upstream operating system.
     * 
     */
    private final String severity;

    @OutputCustomType.Constructor({"classification","cpeUri","cve","severity"})
    private UpgradeDistributionResponse(
        String classification,
        String cpeUri,
        List<String> cve,
        String severity) {
        this.classification = Objects.requireNonNull(classification);
        this.cpeUri = Objects.requireNonNull(cpeUri);
        this.cve = Objects.requireNonNull(cve);
        this.severity = Objects.requireNonNull(severity);
    }

    /**
     * The operating system classification of this Upgrade, as specified by the upstream operating system upgrade feed. For Windows the classification is one of the category_ids listed at https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
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
     * The cve tied to this Upgrade.
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

        public Builder setClassification(String classification) {
            this.classification = Objects.requireNonNull(classification);
            return this;
        }

        public Builder setCpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }

        public Builder setCve(List<String> cve) {
            this.cve = Objects.requireNonNull(cve);
            return this;
        }

        public Builder setSeverity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public UpgradeDistributionResponse build() {
            return new UpgradeDistributionResponse(classification, cpeUri, cve, severity);
        }
    }
}
