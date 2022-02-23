// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.storage.outputs.GetBucketObjectContentCustomerEncryption;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBucketObjectContentResult {
    private final String bucket;
    private final String cacheControl;
    /**
     * (Computed) [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object content.
     * 
     */
    private final @Nullable String content;
    private final String contentDisposition;
    private final String contentEncoding;
    private final String contentLanguage;
    private final String contentType;
    private final String crc32c;
    private final List<GetBucketObjectContentCustomerEncryption> customerEncryptions;
    private final String detectMd5hash;
    private final Boolean eventBasedHold;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String kmsKeyName;
    private final String md5hash;
    private final String mediaLink;
    private final Map<String,String> metadata;
    private final String name;
    private final String outputName;
    private final String selfLink;
    private final String source;
    private final String storageClass;
    private final Boolean temporaryHold;

    @OutputCustomType.Constructor({"bucket","cacheControl","content","contentDisposition","contentEncoding","contentLanguage","contentType","crc32c","customerEncryptions","detectMd5hash","eventBasedHold","id","kmsKeyName","md5hash","mediaLink","metadata","name","outputName","selfLink","source","storageClass","temporaryHold"})
    private GetBucketObjectContentResult(
        String bucket,
        String cacheControl,
        @Nullable String content,
        String contentDisposition,
        String contentEncoding,
        String contentLanguage,
        String contentType,
        String crc32c,
        List<GetBucketObjectContentCustomerEncryption> customerEncryptions,
        String detectMd5hash,
        Boolean eventBasedHold,
        String id,
        String kmsKeyName,
        String md5hash,
        String mediaLink,
        Map<String,String> metadata,
        String name,
        String outputName,
        String selfLink,
        String source,
        String storageClass,
        Boolean temporaryHold) {
        this.bucket = Objects.requireNonNull(bucket);
        this.cacheControl = Objects.requireNonNull(cacheControl);
        this.content = content;
        this.contentDisposition = Objects.requireNonNull(contentDisposition);
        this.contentEncoding = Objects.requireNonNull(contentEncoding);
        this.contentLanguage = Objects.requireNonNull(contentLanguage);
        this.contentType = Objects.requireNonNull(contentType);
        this.crc32c = Objects.requireNonNull(crc32c);
        this.customerEncryptions = Objects.requireNonNull(customerEncryptions);
        this.detectMd5hash = Objects.requireNonNull(detectMd5hash);
        this.eventBasedHold = Objects.requireNonNull(eventBasedHold);
        this.id = Objects.requireNonNull(id);
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
        this.md5hash = Objects.requireNonNull(md5hash);
        this.mediaLink = Objects.requireNonNull(mediaLink);
        this.metadata = Objects.requireNonNull(metadata);
        this.name = Objects.requireNonNull(name);
        this.outputName = Objects.requireNonNull(outputName);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.source = Objects.requireNonNull(source);
        this.storageClass = Objects.requireNonNull(storageClass);
        this.temporaryHold = Objects.requireNonNull(temporaryHold);
    }

    public String getBucket() {
        return this.bucket;
    }
    public String getCacheControl() {
        return this.cacheControl;
    }
    /**
     * (Computed) [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object content.
     * 
     */
    public Optional<String> getContent() {
        return Optional.ofNullable(this.content);
    }
    public String getContentDisposition() {
        return this.contentDisposition;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }
    public String getContentLanguage() {
        return this.contentLanguage;
    }
    public String getContentType() {
        return this.contentType;
    }
    public String getCrc32c() {
        return this.crc32c;
    }
    public List<GetBucketObjectContentCustomerEncryption> getCustomerEncryptions() {
        return this.customerEncryptions;
    }
    public String getDetectMd5hash() {
        return this.detectMd5hash;
    }
    public Boolean getEventBasedHold() {
        return this.eventBasedHold;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }
    public String getMd5hash() {
        return this.md5hash;
    }
    public String getMediaLink() {
        return this.mediaLink;
    }
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    public String getName() {
        return this.name;
    }
    public String getOutputName() {
        return this.outputName;
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public String getSource() {
        return this.source;
    }
    public String getStorageClass() {
        return this.storageClass;
    }
    public Boolean getTemporaryHold() {
        return this.temporaryHold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketObjectContentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String cacheControl;
        private @Nullable String content;
        private String contentDisposition;
        private String contentEncoding;
        private String contentLanguage;
        private String contentType;
        private String crc32c;
        private List<GetBucketObjectContentCustomerEncryption> customerEncryptions;
        private String detectMd5hash;
        private Boolean eventBasedHold;
        private String id;
        private String kmsKeyName;
        private String md5hash;
        private String mediaLink;
        private Map<String,String> metadata;
        private String name;
        private String outputName;
        private String selfLink;
        private String source;
        private String storageClass;
        private Boolean temporaryHold;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketObjectContentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.cacheControl = defaults.cacheControl;
    	      this.content = defaults.content;
    	      this.contentDisposition = defaults.contentDisposition;
    	      this.contentEncoding = defaults.contentEncoding;
    	      this.contentLanguage = defaults.contentLanguage;
    	      this.contentType = defaults.contentType;
    	      this.crc32c = defaults.crc32c;
    	      this.customerEncryptions = defaults.customerEncryptions;
    	      this.detectMd5hash = defaults.detectMd5hash;
    	      this.eventBasedHold = defaults.eventBasedHold;
    	      this.id = defaults.id;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.md5hash = defaults.md5hash;
    	      this.mediaLink = defaults.mediaLink;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.outputName = defaults.outputName;
    	      this.selfLink = defaults.selfLink;
    	      this.source = defaults.source;
    	      this.storageClass = defaults.storageClass;
    	      this.temporaryHold = defaults.temporaryHold;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setCacheControl(String cacheControl) {
            this.cacheControl = Objects.requireNonNull(cacheControl);
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder setContentDisposition(String contentDisposition) {
            this.contentDisposition = Objects.requireNonNull(contentDisposition);
            return this;
        }

        public Builder setContentEncoding(String contentEncoding) {
            this.contentEncoding = Objects.requireNonNull(contentEncoding);
            return this;
        }

        public Builder setContentLanguage(String contentLanguage) {
            this.contentLanguage = Objects.requireNonNull(contentLanguage);
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setCrc32c(String crc32c) {
            this.crc32c = Objects.requireNonNull(crc32c);
            return this;
        }

        public Builder setCustomerEncryptions(List<GetBucketObjectContentCustomerEncryption> customerEncryptions) {
            this.customerEncryptions = Objects.requireNonNull(customerEncryptions);
            return this;
        }

        public Builder setDetectMd5hash(String detectMd5hash) {
            this.detectMd5hash = Objects.requireNonNull(detectMd5hash);
            return this;
        }

        public Builder setEventBasedHold(Boolean eventBasedHold) {
            this.eventBasedHold = Objects.requireNonNull(eventBasedHold);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setMd5hash(String md5hash) {
            this.md5hash = Objects.requireNonNull(md5hash);
            return this;
        }

        public Builder setMediaLink(String mediaLink) {
            this.mediaLink = Objects.requireNonNull(mediaLink);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputName(String outputName) {
            this.outputName = Objects.requireNonNull(outputName);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setStorageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }

        public Builder setTemporaryHold(Boolean temporaryHold) {
            this.temporaryHold = Objects.requireNonNull(temporaryHold);
            return this;
        }
        public GetBucketObjectContentResult build() {
            return new GetBucketObjectContentResult(bucket, cacheControl, content, contentDisposition, contentEncoding, contentLanguage, contentType, crc32c, customerEncryptions, detectMd5hash, eventBasedHold, id, kmsKeyName, md5hash, mediaLink, metadata, name, outputName, selfLink, source, storageClass, temporaryHold);
        }
    }
}
