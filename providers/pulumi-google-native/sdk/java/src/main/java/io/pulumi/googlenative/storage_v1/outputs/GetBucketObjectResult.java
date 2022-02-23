// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.storage_v1.outputs.BucketObjectCustomerEncryptionResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketObjectOwnerResponse;
import io.pulumi.googlenative.storage_v1.outputs.ObjectAccessControlResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetBucketObjectResult {
    /**
     * Access controls on the object.
     * 
     */
    private final List<ObjectAccessControlResponse> acl;
    /**
     * The name of the bucket containing this object.
     * 
     */
    private final String bucket;
    /**
     * Cache-Control directive for the object data. If omitted, and the object is accessible to all anonymous users, the default will be public, max-age=3600.
     * 
     */
    private final String cacheControl;
    /**
     * Number of underlying components that make up this object. Components are accumulated by compose operations.
     * 
     */
    private final Integer componentCount;
    /**
     * Content-Disposition of the object data.
     * 
     */
    private final String contentDisposition;
    /**
     * Content-Encoding of the object data.
     * 
     */
    private final String contentEncoding;
    /**
     * Content-Language of the object data.
     * 
     */
    private final String contentLanguage;
    /**
     * Content-Type of the object data. If an object is stored without a Content-Type, it is served as application/octet-stream.
     * 
     */
    private final String contentType;
    /**
     * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte order. For more information about using the CRC32c checksum, see Hashes and ETags: Best Practices.
     * 
     */
    private final String crc32c;
    /**
     * A timestamp in RFC 3339 format specified by the user for an object.
     * 
     */
    private final String customTime;
    /**
     * Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
     * 
     */
    private final BucketObjectCustomerEncryptionResponse customerEncryption;
    /**
     * HTTP 1.1 Entity tag for the object.
     * 
     */
    private final String etag;
    /**
     * Whether an object is under event-based hold. Event-based hold is a way to retain objects until an event occurs, which is signified by the hold's release (i.e. this value is set to false). After being released (set to false), such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is the loan being paid in full. In this example, these objects will be held intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins from the moment event-based hold transitioned from true to false.
     * 
     */
    private final Boolean eventBasedHold;
    /**
     * The content generation of this object. Used for object versioning.
     * 
     */
    private final String generation;
    /**
     * The kind of item this is. For objects, this is always storage#object.
     * 
     */
    private final String kind;
    /**
     * Not currently supported. Specifying the parameter causes the request to fail with status code 400 - Bad Request.
     * 
     */
    private final String kmsKeyName;
    /**
     * MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see Hashes and ETags: Best Practices.
     * 
     */
    private final String md5Hash;
    /**
     * Media download link.
     * 
     */
    private final String mediaLink;
    /**
     * User-provided metadata, in key/value pairs.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * The version of the metadata for this object at this generation. Used for preconditions and for detecting changes in metadata. A metageneration number is only meaningful in the context of a particular generation of a particular object.
     * 
     */
    private final String metageneration;
    /**
     * The name of the object. Required if not specified by URL parameter.
     * 
     */
    private final String name;
    /**
     * The owner of the object. This will always be the uploader of the object.
     * 
     */
    private final BucketObjectOwnerResponse owner;
    /**
     * A server-determined value that specifies the earliest time that the object's retention period expires. This value is in RFC 3339 format. Note 1: This field is not provided for objects with an active event-based hold, since retention expiration is unknown until the hold is removed. Note 2: This value can be provided even when temporary hold is set (so that the user can reason about policy without having to first unset the temporary hold).
     * 
     */
    private final String retentionExpirationTime;
    /**
     * The link to this object.
     * 
     */
    private final String selfLink;
    /**
     * Content-Length of the data in bytes.
     * 
     */
    private final String size;
    /**
     * Storage class of the object.
     * 
     */
    private final String storageClass;
    /**
     * Whether an object is under temporary hold. While this flag is set to true, the object is protected against deletion and overwrites. A common use case of this flag is regulatory investigations where objects need to be retained while the investigation is ongoing. Note that unlike event-based hold, temporary hold does not impact retention expiration time of an object.
     * 
     */
    private final Boolean temporaryHold;
    /**
     * The creation time of the object in RFC 3339 format.
     * 
     */
    private final String timeCreated;
    /**
     * The deletion time of the object in RFC 3339 format. Will be returned if and only if this version of the object has been deleted.
     * 
     */
    private final String timeDeleted;
    /**
     * The time at which the object's storage class was last changed. When the object is initially created, it will be set to timeCreated.
     * 
     */
    private final String timeStorageClassUpdated;
    /**
     * The modification time of the object metadata in RFC 3339 format.
     * 
     */
    private final String updated;

    @OutputCustomType.Constructor({"acl","bucket","cacheControl","componentCount","contentDisposition","contentEncoding","contentLanguage","contentType","crc32c","customTime","customerEncryption","etag","eventBasedHold","generation","kind","kmsKeyName","md5Hash","mediaLink","metadata","metageneration","name","owner","retentionExpirationTime","selfLink","size","storageClass","temporaryHold","timeCreated","timeDeleted","timeStorageClassUpdated","updated"})
    private GetBucketObjectResult(
        List<ObjectAccessControlResponse> acl,
        String bucket,
        String cacheControl,
        Integer componentCount,
        String contentDisposition,
        String contentEncoding,
        String contentLanguage,
        String contentType,
        String crc32c,
        String customTime,
        BucketObjectCustomerEncryptionResponse customerEncryption,
        String etag,
        Boolean eventBasedHold,
        String generation,
        String kind,
        String kmsKeyName,
        String md5Hash,
        String mediaLink,
        Map<String,String> metadata,
        String metageneration,
        String name,
        BucketObjectOwnerResponse owner,
        String retentionExpirationTime,
        String selfLink,
        String size,
        String storageClass,
        Boolean temporaryHold,
        String timeCreated,
        String timeDeleted,
        String timeStorageClassUpdated,
        String updated) {
        this.acl = Objects.requireNonNull(acl);
        this.bucket = Objects.requireNonNull(bucket);
        this.cacheControl = Objects.requireNonNull(cacheControl);
        this.componentCount = Objects.requireNonNull(componentCount);
        this.contentDisposition = Objects.requireNonNull(contentDisposition);
        this.contentEncoding = Objects.requireNonNull(contentEncoding);
        this.contentLanguage = Objects.requireNonNull(contentLanguage);
        this.contentType = Objects.requireNonNull(contentType);
        this.crc32c = Objects.requireNonNull(crc32c);
        this.customTime = Objects.requireNonNull(customTime);
        this.customerEncryption = Objects.requireNonNull(customerEncryption);
        this.etag = Objects.requireNonNull(etag);
        this.eventBasedHold = Objects.requireNonNull(eventBasedHold);
        this.generation = Objects.requireNonNull(generation);
        this.kind = Objects.requireNonNull(kind);
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
        this.md5Hash = Objects.requireNonNull(md5Hash);
        this.mediaLink = Objects.requireNonNull(mediaLink);
        this.metadata = Objects.requireNonNull(metadata);
        this.metageneration = Objects.requireNonNull(metageneration);
        this.name = Objects.requireNonNull(name);
        this.owner = Objects.requireNonNull(owner);
        this.retentionExpirationTime = Objects.requireNonNull(retentionExpirationTime);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.size = Objects.requireNonNull(size);
        this.storageClass = Objects.requireNonNull(storageClass);
        this.temporaryHold = Objects.requireNonNull(temporaryHold);
        this.timeCreated = Objects.requireNonNull(timeCreated);
        this.timeDeleted = Objects.requireNonNull(timeDeleted);
        this.timeStorageClassUpdated = Objects.requireNonNull(timeStorageClassUpdated);
        this.updated = Objects.requireNonNull(updated);
    }

    /**
     * Access controls on the object.
     * 
     */
    public List<ObjectAccessControlResponse> getAcl() {
        return this.acl;
    }
    /**
     * The name of the bucket containing this object.
     * 
     */
    public String getBucket() {
        return this.bucket;
    }
    /**
     * Cache-Control directive for the object data. If omitted, and the object is accessible to all anonymous users, the default will be public, max-age=3600.
     * 
     */
    public String getCacheControl() {
        return this.cacheControl;
    }
    /**
     * Number of underlying components that make up this object. Components are accumulated by compose operations.
     * 
     */
    public Integer getComponentCount() {
        return this.componentCount;
    }
    /**
     * Content-Disposition of the object data.
     * 
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }
    /**
     * Content-Encoding of the object data.
     * 
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }
    /**
     * Content-Language of the object data.
     * 
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }
    /**
     * Content-Type of the object data. If an object is stored without a Content-Type, it is served as application/octet-stream.
     * 
     */
    public String getContentType() {
        return this.contentType;
    }
    /**
     * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte order. For more information about using the CRC32c checksum, see Hashes and ETags: Best Practices.
     * 
     */
    public String getCrc32c() {
        return this.crc32c;
    }
    /**
     * A timestamp in RFC 3339 format specified by the user for an object.
     * 
     */
    public String getCustomTime() {
        return this.customTime;
    }
    /**
     * Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
     * 
     */
    public BucketObjectCustomerEncryptionResponse getCustomerEncryption() {
        return this.customerEncryption;
    }
    /**
     * HTTP 1.1 Entity tag for the object.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Whether an object is under event-based hold. Event-based hold is a way to retain objects until an event occurs, which is signified by the hold's release (i.e. this value is set to false). After being released (set to false), such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is the loan being paid in full. In this example, these objects will be held intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins from the moment event-based hold transitioned from true to false.
     * 
     */
    public Boolean getEventBasedHold() {
        return this.eventBasedHold;
    }
    /**
     * The content generation of this object. Used for object versioning.
     * 
     */
    public String getGeneration() {
        return this.generation;
    }
    /**
     * The kind of item this is. For objects, this is always storage#object.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Not currently supported. Specifying the parameter causes the request to fail with status code 400 - Bad Request.
     * 
     */
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see Hashes and ETags: Best Practices.
     * 
     */
    public String getMd5Hash() {
        return this.md5Hash;
    }
    /**
     * Media download link.
     * 
     */
    public String getMediaLink() {
        return this.mediaLink;
    }
    /**
     * User-provided metadata, in key/value pairs.
     * 
     */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * The version of the metadata for this object at this generation. Used for preconditions and for detecting changes in metadata. A metageneration number is only meaningful in the context of a particular generation of a particular object.
     * 
     */
    public String getMetageneration() {
        return this.metageneration;
    }
    /**
     * The name of the object. Required if not specified by URL parameter.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The owner of the object. This will always be the uploader of the object.
     * 
     */
    public BucketObjectOwnerResponse getOwner() {
        return this.owner;
    }
    /**
     * A server-determined value that specifies the earliest time that the object's retention period expires. This value is in RFC 3339 format. Note 1: This field is not provided for objects with an active event-based hold, since retention expiration is unknown until the hold is removed. Note 2: This value can be provided even when temporary hold is set (so that the user can reason about policy without having to first unset the temporary hold).
     * 
     */
    public String getRetentionExpirationTime() {
        return this.retentionExpirationTime;
    }
    /**
     * The link to this object.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Content-Length of the data in bytes.
     * 
     */
    public String getSize() {
        return this.size;
    }
    /**
     * Storage class of the object.
     * 
     */
    public String getStorageClass() {
        return this.storageClass;
    }
    /**
     * Whether an object is under temporary hold. While this flag is set to true, the object is protected against deletion and overwrites. A common use case of this flag is regulatory investigations where objects need to be retained while the investigation is ongoing. Note that unlike event-based hold, temporary hold does not impact retention expiration time of an object.
     * 
     */
    public Boolean getTemporaryHold() {
        return this.temporaryHold;
    }
    /**
     * The creation time of the object in RFC 3339 format.
     * 
     */
    public String getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * The deletion time of the object in RFC 3339 format. Will be returned if and only if this version of the object has been deleted.
     * 
     */
    public String getTimeDeleted() {
        return this.timeDeleted;
    }
    /**
     * The time at which the object's storage class was last changed. When the object is initially created, it will be set to timeCreated.
     * 
     */
    public String getTimeStorageClassUpdated() {
        return this.timeStorageClassUpdated;
    }
    /**
     * The modification time of the object metadata in RFC 3339 format.
     * 
     */
    public String getUpdated() {
        return this.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketObjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ObjectAccessControlResponse> acl;
        private String bucket;
        private String cacheControl;
        private Integer componentCount;
        private String contentDisposition;
        private String contentEncoding;
        private String contentLanguage;
        private String contentType;
        private String crc32c;
        private String customTime;
        private BucketObjectCustomerEncryptionResponse customerEncryption;
        private String etag;
        private Boolean eventBasedHold;
        private String generation;
        private String kind;
        private String kmsKeyName;
        private String md5Hash;
        private String mediaLink;
        private Map<String,String> metadata;
        private String metageneration;
        private String name;
        private BucketObjectOwnerResponse owner;
        private String retentionExpirationTime;
        private String selfLink;
        private String size;
        private String storageClass;
        private Boolean temporaryHold;
        private String timeCreated;
        private String timeDeleted;
        private String timeStorageClassUpdated;
        private String updated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketObjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acl = defaults.acl;
    	      this.bucket = defaults.bucket;
    	      this.cacheControl = defaults.cacheControl;
    	      this.componentCount = defaults.componentCount;
    	      this.contentDisposition = defaults.contentDisposition;
    	      this.contentEncoding = defaults.contentEncoding;
    	      this.contentLanguage = defaults.contentLanguage;
    	      this.contentType = defaults.contentType;
    	      this.crc32c = defaults.crc32c;
    	      this.customTime = defaults.customTime;
    	      this.customerEncryption = defaults.customerEncryption;
    	      this.etag = defaults.etag;
    	      this.eventBasedHold = defaults.eventBasedHold;
    	      this.generation = defaults.generation;
    	      this.kind = defaults.kind;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.md5Hash = defaults.md5Hash;
    	      this.mediaLink = defaults.mediaLink;
    	      this.metadata = defaults.metadata;
    	      this.metageneration = defaults.metageneration;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.retentionExpirationTime = defaults.retentionExpirationTime;
    	      this.selfLink = defaults.selfLink;
    	      this.size = defaults.size;
    	      this.storageClass = defaults.storageClass;
    	      this.temporaryHold = defaults.temporaryHold;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeDeleted = defaults.timeDeleted;
    	      this.timeStorageClassUpdated = defaults.timeStorageClassUpdated;
    	      this.updated = defaults.updated;
        }

        public Builder setAcl(List<ObjectAccessControlResponse> acl) {
            this.acl = Objects.requireNonNull(acl);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setCacheControl(String cacheControl) {
            this.cacheControl = Objects.requireNonNull(cacheControl);
            return this;
        }

        public Builder setComponentCount(Integer componentCount) {
            this.componentCount = Objects.requireNonNull(componentCount);
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

        public Builder setCustomTime(String customTime) {
            this.customTime = Objects.requireNonNull(customTime);
            return this;
        }

        public Builder setCustomerEncryption(BucketObjectCustomerEncryptionResponse customerEncryption) {
            this.customerEncryption = Objects.requireNonNull(customerEncryption);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setEventBasedHold(Boolean eventBasedHold) {
            this.eventBasedHold = Objects.requireNonNull(eventBasedHold);
            return this;
        }

        public Builder setGeneration(String generation) {
            this.generation = Objects.requireNonNull(generation);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setMd5Hash(String md5Hash) {
            this.md5Hash = Objects.requireNonNull(md5Hash);
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

        public Builder setMetageneration(String metageneration) {
            this.metageneration = Objects.requireNonNull(metageneration);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOwner(BucketObjectOwnerResponse owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }

        public Builder setRetentionExpirationTime(String retentionExpirationTime) {
            this.retentionExpirationTime = Objects.requireNonNull(retentionExpirationTime);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSize(String size) {
            this.size = Objects.requireNonNull(size);
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

        public Builder setTimeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }

        public Builder setTimeDeleted(String timeDeleted) {
            this.timeDeleted = Objects.requireNonNull(timeDeleted);
            return this;
        }

        public Builder setTimeStorageClassUpdated(String timeStorageClassUpdated) {
            this.timeStorageClassUpdated = Objects.requireNonNull(timeStorageClassUpdated);
            return this;
        }

        public Builder setUpdated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }
        public GetBucketObjectResult build() {
            return new GetBucketObjectResult(acl, bucket, cacheControl, componentCount, contentDisposition, contentEncoding, contentLanguage, contentType, crc32c, customTime, customerEncryption, etag, eventBasedHold, generation, kind, kmsKeyName, md5Hash, mediaLink, metadata, metageneration, name, owner, retentionExpirationTime, selfLink, size, storageClass, temporaryHold, timeCreated, timeDeleted, timeStorageClassUpdated, updated);
        }
    }
}
