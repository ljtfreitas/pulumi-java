// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authentication certificates of an application gateway.
 * 
 */
public final class ApplicationGatewayAuthenticationCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayAuthenticationCertificateResponse Empty = new ApplicationGatewayAuthenticationCertificateResponse();

    /**
     * Certificate public data.
     * 
     */
    @InputImport(name="data")
    private final @Nullable String data;

    public Optional<String> getData() {
        return this.data == null ? Optional.empty() : Optional.ofNullable(this.data);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Name of the authentication certificate that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the authentication certificate resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Type of the resource.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ApplicationGatewayAuthenticationCertificateResponse(
        @Nullable String data,
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        String type) {
        this.data = data;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ApplicationGatewayAuthenticationCertificateResponse() {
        this.data = null;
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayAuthenticationCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String data;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayAuthenticationCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setData(@Nullable String data) {
            this.data = data;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ApplicationGatewayAuthenticationCertificateResponse build() {
            return new ApplicationGatewayAuthenticationCertificateResponse(data, etag, id, name, provisioningState, type);
        }
    }
}
