// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the CIS benchmark version that is applicable to a given OS and os version.
 * 
 */
public final class ComplianceVersionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComplianceVersionResponse Empty = new ComplianceVersionResponse();

    /**
     * The CPE URI (https://cpe.mitre.org/specification/) this benchmark is applicable to.
     * 
     */
    @Import(name="cpeUri", required=true)
      private final String cpeUri;

    public String getCpeUri() {
        return this.cpeUri;
    }

    /**
     * The version of the benchmark. This is set to the version of the OS-specific CIS document the benchmark is defined in.
     * 
     */
    @Import(name="version", required=true)
      private final String version;

    public String getVersion() {
        return this.version;
    }

    public ComplianceVersionResponse(
        String cpeUri,
        String version) {
        this.cpeUri = Objects.requireNonNull(cpeUri, "expected parameter 'cpeUri' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private ComplianceVersionResponse() {
        this.cpeUri = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComplianceVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpeUri;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ComplianceVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.version = defaults.version;
        }

        public Builder cpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public ComplianceVersionResponse build() {
            return new ComplianceVersionResponse(cpeUri, version);
        }
    }
}
