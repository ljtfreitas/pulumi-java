// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetObjectSignedUrlResult {
    private final String bucket;
    private final @Nullable String contentMd5;
    private final @Nullable String contentType;
    private final @Nullable String credentials;
    private final @Nullable String duration;
    private final @Nullable Map<String,String> extensionHeaders;
    private final @Nullable String httpMethod;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String path;
    /**
     * The signed URL that can be used to access the storage object without authentication.
     * 
     */
    private final String signedUrl;

    @CustomType.Constructor
    private GetObjectSignedUrlResult(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("contentMd5") @Nullable String contentMd5,
        @CustomType.Parameter("contentType") @Nullable String contentType,
        @CustomType.Parameter("credentials") @Nullable String credentials,
        @CustomType.Parameter("duration") @Nullable String duration,
        @CustomType.Parameter("extensionHeaders") @Nullable Map<String,String> extensionHeaders,
        @CustomType.Parameter("httpMethod") @Nullable String httpMethod,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("signedUrl") String signedUrl) {
        this.bucket = bucket;
        this.contentMd5 = contentMd5;
        this.contentType = contentType;
        this.credentials = credentials;
        this.duration = duration;
        this.extensionHeaders = extensionHeaders;
        this.httpMethod = httpMethod;
        this.id = id;
        this.path = path;
        this.signedUrl = signedUrl;
    }

    public String bucket() {
        return this.bucket;
    }
    public Optional<String> contentMd5() {
        return Optional.ofNullable(this.contentMd5);
    }
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    public Optional<String> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }
    public Map<String,String> extensionHeaders() {
        return this.extensionHeaders == null ? Map.of() : this.extensionHeaders;
    }
    public Optional<String> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public String path() {
        return this.path;
    }
    /**
     * The signed URL that can be used to access the storage object without authentication.
     * 
    */
    public String signedUrl() {
        return this.signedUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectSignedUrlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String contentMd5;
        private @Nullable String contentType;
        private @Nullable String credentials;
        private @Nullable String duration;
        private @Nullable Map<String,String> extensionHeaders;
        private @Nullable String httpMethod;
        private String id;
        private String path;
        private String signedUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetObjectSignedUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.contentMd5 = defaults.contentMd5;
    	      this.contentType = defaults.contentType;
    	      this.credentials = defaults.credentials;
    	      this.duration = defaults.duration;
    	      this.extensionHeaders = defaults.extensionHeaders;
    	      this.httpMethod = defaults.httpMethod;
    	      this.id = defaults.id;
    	      this.path = defaults.path;
    	      this.signedUrl = defaults.signedUrl;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder contentMd5(@Nullable String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder credentials(@Nullable String credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder duration(@Nullable String duration) {
            this.duration = duration;
            return this;
        }
        public Builder extensionHeaders(@Nullable Map<String,String> extensionHeaders) {
            this.extensionHeaders = extensionHeaders;
            return this;
        }
        public Builder httpMethod(@Nullable String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder signedUrl(String signedUrl) {
            this.signedUrl = Objects.requireNonNull(signedUrl);
            return this;
        }        public GetObjectSignedUrlResult build() {
            return new GetObjectSignedUrlResult(bucket, contentMd5, contentType, credentials, duration, extensionHeaders, httpMethod, id, path, signedUrl);
        }
    }
}
