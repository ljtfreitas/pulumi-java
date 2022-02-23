// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Data Lake Store trusted identity provider information.
 * 
 */
public final class TrustedIdProviderResponse extends io.pulumi.resources.InvokeArgs {

    public static final TrustedIdProviderResponse Empty = new TrustedIdProviderResponse();

    /**
     * The resource identifier.
     * 
     */
    @InputImport(name="id", required=true)
        private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The URL of this trusted identity provider.
     * 
     */
    @InputImport(name="idProvider", required=true)
        private final String idProvider;

    public String getIdProvider() {
        return this.idProvider;
    }

    /**
     * The resource name.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The resource type.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public TrustedIdProviderResponse(
        String id,
        String idProvider,
        String name,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.idProvider = Objects.requireNonNull(idProvider, "expected parameter 'idProvider' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TrustedIdProviderResponse() {
        this.id = null;
        this.idProvider = null;
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrustedIdProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String idProvider;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TrustedIdProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.idProvider = defaults.idProvider;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdProvider(String idProvider) {
            this.idProvider = Objects.requireNonNull(idProvider);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TrustedIdProviderResponse build() {
            return new TrustedIdProviderResponse(id, idProvider, name, type);
        }
    }
}
