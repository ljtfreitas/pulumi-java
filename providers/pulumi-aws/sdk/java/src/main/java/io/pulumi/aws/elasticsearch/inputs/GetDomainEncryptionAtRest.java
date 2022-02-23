// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetDomainEncryptionAtRest extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainEncryptionAtRest Empty = new GetDomainEncryptionAtRest();

    /**
     * Whether node to node encryption is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * The KMS key id used to encrypt data at rest.
     * 
     */
    @InputImport(name="kmsKeyId", required=true)
    private final String kmsKeyId;

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public GetDomainEncryptionAtRest(
        Boolean enabled,
        String kmsKeyId) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.kmsKeyId = Objects.requireNonNull(kmsKeyId, "expected parameter 'kmsKeyId' to be non-null");
    }

    private GetDomainEncryptionAtRest() {
        this.enabled = null;
        this.kmsKeyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainEncryptionAtRest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainEncryptionAtRest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public GetDomainEncryptionAtRest build() {
            return new GetDomainEncryptionAtRest(enabled, kmsKeyId);
        }
    }
}