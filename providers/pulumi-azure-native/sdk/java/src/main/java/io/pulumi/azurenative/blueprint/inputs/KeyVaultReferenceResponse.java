// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the link to a Key Vault.
 * 
 */
public final class KeyVaultReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultReferenceResponse Empty = new KeyVaultReferenceResponse();

    /**
     * Azure resource ID of the Key Vault.
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    public KeyVaultReferenceResponse(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private KeyVaultReferenceResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public KeyVaultReferenceResponse build() {
            return new KeyVaultReferenceResponse(id);
        }
    }
}
