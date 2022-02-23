// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Identifies the Azure key vault associated with a Batch account.
 * 
 */
public final class KeyVaultReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultReferenceResponse Empty = new KeyVaultReferenceResponse();

    /**
     * The resource ID of the Azure key vault associated with the Batch account.
     * 
     */
    @InputImport(name="id", required=true)
        private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The URL of the Azure key vault associated with the Batch account.
     * 
     */
    @InputImport(name="url", required=true)
        private final String url;

    public String getUrl() {
        return this.url;
    }

    public KeyVaultReferenceResponse(
        String id,
        String url) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private KeyVaultReferenceResponse() {
        this.id = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.url = defaults.url;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public KeyVaultReferenceResponse build() {
            return new KeyVaultReferenceResponse(id, url);
        }
    }
}
