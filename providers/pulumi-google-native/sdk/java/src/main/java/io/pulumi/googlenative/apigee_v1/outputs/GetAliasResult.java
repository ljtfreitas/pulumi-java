// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1CertificateResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetAliasResult {
    /**
     * Resource ID for this alias. Values must match the regular expression `[^/]{1,255}`.
     * 
     */
    private final String alias;
    /**
     * Chain of certificates under this alias.
     * 
     */
    private final GoogleCloudApigeeV1CertificateResponse certsInfo;
    /**
     * Type of alias.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"alias","certsInfo","type"})
    private GetAliasResult(
        String alias,
        GoogleCloudApigeeV1CertificateResponse certsInfo,
        String type) {
        this.alias = Objects.requireNonNull(alias);
        this.certsInfo = Objects.requireNonNull(certsInfo);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource ID for this alias. Values must match the regular expression `[^/]{1,255}`.
     * 
     */
    public String getAlias() {
        return this.alias;
    }
    /**
     * Chain of certificates under this alias.
     * 
     */
    public GoogleCloudApigeeV1CertificateResponse getCertsInfo() {
        return this.certsInfo;
    }
    /**
     * Type of alias.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAliasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alias;
        private GoogleCloudApigeeV1CertificateResponse certsInfo;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.certsInfo = defaults.certsInfo;
    	      this.type = defaults.type;
        }

        public Builder setAlias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }

        public Builder setCertsInfo(GoogleCloudApigeeV1CertificateResponse certsInfo) {
            this.certsInfo = Objects.requireNonNull(certsInfo);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAliasResult build() {
            return new GetAliasResult(alias, certsInfo, type);
        }
    }
}
