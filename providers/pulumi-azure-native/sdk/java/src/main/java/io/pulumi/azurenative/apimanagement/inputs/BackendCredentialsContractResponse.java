// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.BackendAuthorizationHeaderCredentialsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the Credentials used to connect to Backend.
 * 
 */
public final class BackendCredentialsContractResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendCredentialsContractResponse Empty = new BackendCredentialsContractResponse();

    /**
     * Authorization header authentication
     * 
     */
    @InputImport(name="authorization")
    private final @Nullable BackendAuthorizationHeaderCredentialsResponse authorization;

    public Optional<BackendAuthorizationHeaderCredentialsResponse> getAuthorization() {
        return this.authorization == null ? Optional.empty() : Optional.ofNullable(this.authorization);
    }

    /**
     * List of Client Certificate Thumbprints. Will be ignored if certificatesIds are provided.
     * 
     */
    @InputImport(name="certificate")
    private final @Nullable List<String> certificate;

    public List<String> getCertificate() {
        return this.certificate == null ? List.of() : this.certificate;
    }

    /**
     * List of Client Certificate Ids.
     * 
     */
    @InputImport(name="certificateIds")
    private final @Nullable List<String> certificateIds;

    public List<String> getCertificateIds() {
        return this.certificateIds == null ? List.of() : this.certificateIds;
    }

    /**
     * Header Parameter description.
     * 
     */
    @InputImport(name="header")
    private final @Nullable Map<String,List<String>> header;

    public Map<String,List<String>> getHeader() {
        return this.header == null ? Map.of() : this.header;
    }

    /**
     * Query Parameter description.
     * 
     */
    @InputImport(name="query")
    private final @Nullable Map<String,List<String>> query;

    public Map<String,List<String>> getQuery() {
        return this.query == null ? Map.of() : this.query;
    }

    public BackendCredentialsContractResponse(
        @Nullable BackendAuthorizationHeaderCredentialsResponse authorization,
        @Nullable List<String> certificate,
        @Nullable List<String> certificateIds,
        @Nullable Map<String,List<String>> header,
        @Nullable Map<String,List<String>> query) {
        this.authorization = authorization;
        this.certificate = certificate;
        this.certificateIds = certificateIds;
        this.header = header;
        this.query = query;
    }

    private BackendCredentialsContractResponse() {
        this.authorization = null;
        this.certificate = List.of();
        this.certificateIds = List.of();
        this.header = Map.of();
        this.query = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendCredentialsContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BackendAuthorizationHeaderCredentialsResponse authorization;
        private @Nullable List<String> certificate;
        private @Nullable List<String> certificateIds;
        private @Nullable Map<String,List<String>> header;
        private @Nullable Map<String,List<String>> query;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendCredentialsContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorization = defaults.authorization;
    	      this.certificate = defaults.certificate;
    	      this.certificateIds = defaults.certificateIds;
    	      this.header = defaults.header;
    	      this.query = defaults.query;
        }

        public Builder setAuthorization(@Nullable BackendAuthorizationHeaderCredentialsResponse authorization) {
            this.authorization = authorization;
            return this;
        }

        public Builder setCertificate(@Nullable List<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setCertificateIds(@Nullable List<String> certificateIds) {
            this.certificateIds = certificateIds;
            return this;
        }

        public Builder setHeader(@Nullable Map<String,List<String>> header) {
            this.header = header;
            return this;
        }

        public Builder setQuery(@Nullable Map<String,List<String>> query) {
            this.query = query;
            return this;
        }

        public BackendCredentialsContractResponse build() {
            return new BackendCredentialsContractResponse(authorization, certificate, certificateIds, header, query);
        }
    }
}
