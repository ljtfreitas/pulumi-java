// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1ApiProductRefResponse;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1AttributeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudApigeeV1CredentialResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1CredentialResponse Empty = new GoogleCloudApigeeV1CredentialResponse();

    /**
     * List of API products this credential can be used for.
     * 
     */
    @Import(name="apiProducts", required=true)
      private final List<GoogleCloudApigeeV1ApiProductRefResponse> apiProducts;

    public List<GoogleCloudApigeeV1ApiProductRefResponse> getApiProducts() {
        return this.apiProducts;
    }

    /**
     * List of attributes associated with this credential.
     * 
     */
    @Import(name="attributes", required=true)
      private final List<GoogleCloudApigeeV1AttributeResponse> attributes;

    public List<GoogleCloudApigeeV1AttributeResponse> getAttributes() {
        return this.attributes;
    }

    /**
     * Consumer key.
     * 
     */
    @Import(name="consumerKey", required=true)
      private final String consumerKey;

    public String getConsumerKey() {
        return this.consumerKey;
    }

    /**
     * Secret key.
     * 
     */
    @Import(name="consumerSecret", required=true)
      private final String consumerSecret;

    public String getConsumerSecret() {
        return this.consumerSecret;
    }

    /**
     * Time the credential will expire in milliseconds since epoch.
     * 
     */
    @Import(name="expiresAt", required=true)
      private final String expiresAt;

    public String getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * Time the credential was issued in milliseconds since epoch.
     * 
     */
    @Import(name="issuedAt", required=true)
      private final String issuedAt;

    public String getIssuedAt() {
        return this.issuedAt;
    }

    /**
     * List of scopes to apply to the app. Specified scopes must already exist on the API product that you associate with the app.
     * 
     */
    @Import(name="scopes", required=true)
      private final List<String> scopes;

    public List<String> getScopes() {
        return this.scopes;
    }

    /**
     * Status of the credential. Valid values include `approved` or `revoked`.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    public GoogleCloudApigeeV1CredentialResponse(
        List<GoogleCloudApigeeV1ApiProductRefResponse> apiProducts,
        List<GoogleCloudApigeeV1AttributeResponse> attributes,
        String consumerKey,
        String consumerSecret,
        String expiresAt,
        String issuedAt,
        List<String> scopes,
        String status) {
        this.apiProducts = Objects.requireNonNull(apiProducts, "expected parameter 'apiProducts' to be non-null");
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.consumerKey = Objects.requireNonNull(consumerKey, "expected parameter 'consumerKey' to be non-null");
        this.consumerSecret = Objects.requireNonNull(consumerSecret, "expected parameter 'consumerSecret' to be non-null");
        this.expiresAt = Objects.requireNonNull(expiresAt, "expected parameter 'expiresAt' to be non-null");
        this.issuedAt = Objects.requireNonNull(issuedAt, "expected parameter 'issuedAt' to be non-null");
        this.scopes = Objects.requireNonNull(scopes, "expected parameter 'scopes' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private GoogleCloudApigeeV1CredentialResponse() {
        this.apiProducts = List.of();
        this.attributes = List.of();
        this.consumerKey = null;
        this.consumerSecret = null;
        this.expiresAt = null;
        this.issuedAt = null;
        this.scopes = List.of();
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1CredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudApigeeV1ApiProductRefResponse> apiProducts;
        private List<GoogleCloudApigeeV1AttributeResponse> attributes;
        private String consumerKey;
        private String consumerSecret;
        private String expiresAt;
        private String issuedAt;
        private List<String> scopes;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1CredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProducts = defaults.apiProducts;
    	      this.attributes = defaults.attributes;
    	      this.consumerKey = defaults.consumerKey;
    	      this.consumerSecret = defaults.consumerSecret;
    	      this.expiresAt = defaults.expiresAt;
    	      this.issuedAt = defaults.issuedAt;
    	      this.scopes = defaults.scopes;
    	      this.status = defaults.status;
        }

        public Builder apiProducts(List<GoogleCloudApigeeV1ApiProductRefResponse> apiProducts) {
            this.apiProducts = Objects.requireNonNull(apiProducts);
            return this;
        }

        public Builder attributes(List<GoogleCloudApigeeV1AttributeResponse> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder consumerKey(String consumerKey) {
            this.consumerKey = Objects.requireNonNull(consumerKey);
            return this;
        }

        public Builder consumerSecret(String consumerSecret) {
            this.consumerSecret = Objects.requireNonNull(consumerSecret);
            return this;
        }

        public Builder expiresAt(String expiresAt) {
            this.expiresAt = Objects.requireNonNull(expiresAt);
            return this;
        }

        public Builder issuedAt(String issuedAt) {
            this.issuedAt = Objects.requireNonNull(issuedAt);
            return this;
        }

        public Builder scopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GoogleCloudApigeeV1CredentialResponse build() {
            return new GoogleCloudApigeeV1CredentialResponse(apiProducts, attributes, consumerKey, consumerSecret, expiresAt, issuedAt, scopes, status);
        }
    }
}
