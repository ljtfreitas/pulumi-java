// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.storage_v1.outputs.BucketAccessControlResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketAutoclassResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketBillingResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketCorsItemResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketCustomPlacementConfigResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketEncryptionResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketIamConfigurationResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketLifecycleResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketLoggingResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketOwnerResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketRetentionPolicyResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketVersioningResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketWebsiteResponse;
import io.pulumi.googlenative.storage_v1.outputs.ObjectAccessControlResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetBucketResult {
    /**
     * Access controls on the bucket.
     * 
     */
    private final List<BucketAccessControlResponse> acl;
    /**
     * The bucket's Autoclass configuration.
     * 
     */
    private final BucketAutoclassResponse autoclass;
    /**
     * The bucket's billing configuration.
     * 
     */
    private final BucketBillingResponse billing;
    /**
     * The bucket's Cross-Origin Resource Sharing (CORS) configuration.
     * 
     */
    private final List<BucketCorsItemResponse> cors;
    /**
     * The bucket's custom placement configuration for Custom Dual Regions.
     * 
     */
    private final BucketCustomPlacementConfigResponse customPlacementConfig;
    /**
     * The default value for event-based hold on newly created objects in this bucket. Event-based hold is a way to retain objects indefinitely until an event occurs, signified by the hold's release. After being released, such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is loan being paid in full. In this example, these objects will be held intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins from the moment event-based hold transitioned from true to false. Objects under event-based hold cannot be deleted, overwritten or archived until the hold is removed.
     * 
     */
    private final Boolean defaultEventBasedHold;
    /**
     * Default access controls to apply to new objects when no ACL is provided.
     * 
     */
    private final List<ObjectAccessControlResponse> defaultObjectAcl;
    /**
     * Encryption configuration for a bucket.
     * 
     */
    private final BucketEncryptionResponse encryption;
    /**
     * HTTP 1.1 Entity tag for the bucket.
     * 
     */
    private final String etag;
    /**
     * The bucket's IAM configuration.
     * 
     */
    private final BucketIamConfigurationResponse iamConfiguration;
    /**
     * The kind of item this is. For buckets, this is always storage#bucket.
     * 
     */
    private final String kind;
    /**
     * User-provided labels, in key/value pairs.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The bucket's lifecycle configuration. See lifecycle management for more information.
     * 
     */
    private final BucketLifecycleResponse lifecycle;
    /**
     * The location of the bucket. Object data for objects in the bucket resides in physical storage within this region. Defaults to US. See the developer's guide for the authoritative list.
     * 
     */
    private final String location;
    /**
     * The type of the bucket location.
     * 
     */
    private final String locationType;
    /**
     * The bucket's logging configuration, which defines the destination bucket and optional name prefix for the current bucket's logs.
     * 
     */
    private final BucketLoggingResponse logging;
    /**
     * The metadata generation of this bucket.
     * 
     */
    private final String metageneration;
    /**
     * The name of the bucket.
     * 
     */
    private final String name;
    /**
     * The owner of the bucket. This is always the project team's owner group.
     * 
     */
    private final BucketOwnerResponse owner;
    /**
     * The project number of the project the bucket belongs to.
     * 
     */
    private final String projectNumber;
    /**
     * The bucket's retention policy. The retention policy enforces a minimum retention time for all objects contained in the bucket, based on their creation time. Any attempt to overwrite or delete objects younger than the retention period will result in a PERMISSION_DENIED error. An unlocked retention policy can be modified or removed from the bucket via a storage.buckets.update operation. A locked retention policy cannot be removed or shortened in duration for the lifetime of the bucket. Attempting to remove or decrease period of a locked retention policy will result in a PERMISSION_DENIED error.
     * 
     */
    private final BucketRetentionPolicyResponse retentionPolicy;
    /**
     * The Recovery Point Objective (RPO) of this bucket. Set to ASYNC_TURBO to turn on Turbo Replication on a bucket.
     * 
     */
    private final String rpo;
    /**
     * Reserved for future use.
     * 
     */
    private final Boolean satisfiesPZS;
    /**
     * The URI of this bucket.
     * 
     */
    private final String selfLink;
    /**
     * The bucket's default storage class, used whenever no storageClass is specified for a newly-created object. This defines how objects in the bucket are stored and determines the SLA and the cost of storage. Values include MULTI_REGIONAL, REGIONAL, STANDARD, NEARLINE, COLDLINE, ARCHIVE, and DURABLE_REDUCED_AVAILABILITY. If this value is not specified when the bucket is created, it will default to STANDARD. For more information, see storage classes.
     * 
     */
    private final String storageClass;
    /**
     * The creation time of the bucket in RFC 3339 format.
     * 
     */
    private final String timeCreated;
    /**
     * The modification time of the bucket in RFC 3339 format.
     * 
     */
    private final String updated;
    /**
     * The bucket's versioning configuration.
     * 
     */
    private final BucketVersioningResponse versioning;
    /**
     * The bucket's website configuration, controlling how the service behaves when accessing bucket contents as a web site. See the Static Website Examples for more information.
     * 
     */
    private final BucketWebsiteResponse website;

    @OutputCustomType.Constructor({"acl","autoclass","billing","cors","customPlacementConfig","defaultEventBasedHold","defaultObjectAcl","encryption","etag","iamConfiguration","kind","labels","lifecycle","location","locationType","logging","metageneration","name","owner","projectNumber","retentionPolicy","rpo","satisfiesPZS","selfLink","storageClass","timeCreated","updated","versioning","website"})
    private GetBucketResult(
        List<BucketAccessControlResponse> acl,
        BucketAutoclassResponse autoclass,
        BucketBillingResponse billing,
        List<BucketCorsItemResponse> cors,
        BucketCustomPlacementConfigResponse customPlacementConfig,
        Boolean defaultEventBasedHold,
        List<ObjectAccessControlResponse> defaultObjectAcl,
        BucketEncryptionResponse encryption,
        String etag,
        BucketIamConfigurationResponse iamConfiguration,
        String kind,
        Map<String,String> labels,
        BucketLifecycleResponse lifecycle,
        String location,
        String locationType,
        BucketLoggingResponse logging,
        String metageneration,
        String name,
        BucketOwnerResponse owner,
        String projectNumber,
        BucketRetentionPolicyResponse retentionPolicy,
        String rpo,
        Boolean satisfiesPZS,
        String selfLink,
        String storageClass,
        String timeCreated,
        String updated,
        BucketVersioningResponse versioning,
        BucketWebsiteResponse website) {
        this.acl = Objects.requireNonNull(acl);
        this.autoclass = Objects.requireNonNull(autoclass);
        this.billing = Objects.requireNonNull(billing);
        this.cors = Objects.requireNonNull(cors);
        this.customPlacementConfig = Objects.requireNonNull(customPlacementConfig);
        this.defaultEventBasedHold = Objects.requireNonNull(defaultEventBasedHold);
        this.defaultObjectAcl = Objects.requireNonNull(defaultObjectAcl);
        this.encryption = Objects.requireNonNull(encryption);
        this.etag = Objects.requireNonNull(etag);
        this.iamConfiguration = Objects.requireNonNull(iamConfiguration);
        this.kind = Objects.requireNonNull(kind);
        this.labels = Objects.requireNonNull(labels);
        this.lifecycle = Objects.requireNonNull(lifecycle);
        this.location = Objects.requireNonNull(location);
        this.locationType = Objects.requireNonNull(locationType);
        this.logging = Objects.requireNonNull(logging);
        this.metageneration = Objects.requireNonNull(metageneration);
        this.name = Objects.requireNonNull(name);
        this.owner = Objects.requireNonNull(owner);
        this.projectNumber = Objects.requireNonNull(projectNumber);
        this.retentionPolicy = Objects.requireNonNull(retentionPolicy);
        this.rpo = Objects.requireNonNull(rpo);
        this.satisfiesPZS = Objects.requireNonNull(satisfiesPZS);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.storageClass = Objects.requireNonNull(storageClass);
        this.timeCreated = Objects.requireNonNull(timeCreated);
        this.updated = Objects.requireNonNull(updated);
        this.versioning = Objects.requireNonNull(versioning);
        this.website = Objects.requireNonNull(website);
    }

    /**
     * Access controls on the bucket.
     * 
     */
    public List<BucketAccessControlResponse> getAcl() {
        return this.acl;
    }
    /**
     * The bucket's Autoclass configuration.
     * 
     */
    public BucketAutoclassResponse getAutoclass() {
        return this.autoclass;
    }
    /**
     * The bucket's billing configuration.
     * 
     */
    public BucketBillingResponse getBilling() {
        return this.billing;
    }
    /**
     * The bucket's Cross-Origin Resource Sharing (CORS) configuration.
     * 
     */
    public List<BucketCorsItemResponse> getCors() {
        return this.cors;
    }
    /**
     * The bucket's custom placement configuration for Custom Dual Regions.
     * 
     */
    public BucketCustomPlacementConfigResponse getCustomPlacementConfig() {
        return this.customPlacementConfig;
    }
    /**
     * The default value for event-based hold on newly created objects in this bucket. Event-based hold is a way to retain objects indefinitely until an event occurs, signified by the hold's release. After being released, such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is loan being paid in full. In this example, these objects will be held intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins from the moment event-based hold transitioned from true to false. Objects under event-based hold cannot be deleted, overwritten or archived until the hold is removed.
     * 
     */
    public Boolean getDefaultEventBasedHold() {
        return this.defaultEventBasedHold;
    }
    /**
     * Default access controls to apply to new objects when no ACL is provided.
     * 
     */
    public List<ObjectAccessControlResponse> getDefaultObjectAcl() {
        return this.defaultObjectAcl;
    }
    /**
     * Encryption configuration for a bucket.
     * 
     */
    public BucketEncryptionResponse getEncryption() {
        return this.encryption;
    }
    /**
     * HTTP 1.1 Entity tag for the bucket.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The bucket's IAM configuration.
     * 
     */
    public BucketIamConfigurationResponse getIamConfiguration() {
        return this.iamConfiguration;
    }
    /**
     * The kind of item this is. For buckets, this is always storage#bucket.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * User-provided labels, in key/value pairs.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The bucket's lifecycle configuration. See lifecycle management for more information.
     * 
     */
    public BucketLifecycleResponse getLifecycle() {
        return this.lifecycle;
    }
    /**
     * The location of the bucket. Object data for objects in the bucket resides in physical storage within this region. Defaults to US. See the developer's guide for the authoritative list.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * The type of the bucket location.
     * 
     */
    public String getLocationType() {
        return this.locationType;
    }
    /**
     * The bucket's logging configuration, which defines the destination bucket and optional name prefix for the current bucket's logs.
     * 
     */
    public BucketLoggingResponse getLogging() {
        return this.logging;
    }
    /**
     * The metadata generation of this bucket.
     * 
     */
    public String getMetageneration() {
        return this.metageneration;
    }
    /**
     * The name of the bucket.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The owner of the bucket. This is always the project team's owner group.
     * 
     */
    public BucketOwnerResponse getOwner() {
        return this.owner;
    }
    /**
     * The project number of the project the bucket belongs to.
     * 
     */
    public String getProjectNumber() {
        return this.projectNumber;
    }
    /**
     * The bucket's retention policy. The retention policy enforces a minimum retention time for all objects contained in the bucket, based on their creation time. Any attempt to overwrite or delete objects younger than the retention period will result in a PERMISSION_DENIED error. An unlocked retention policy can be modified or removed from the bucket via a storage.buckets.update operation. A locked retention policy cannot be removed or shortened in duration for the lifetime of the bucket. Attempting to remove or decrease period of a locked retention policy will result in a PERMISSION_DENIED error.
     * 
     */
    public BucketRetentionPolicyResponse getRetentionPolicy() {
        return this.retentionPolicy;
    }
    /**
     * The Recovery Point Objective (RPO) of this bucket. Set to ASYNC_TURBO to turn on Turbo Replication on a bucket.
     * 
     */
    public String getRpo() {
        return this.rpo;
    }
    /**
     * Reserved for future use.
     * 
     */
    public Boolean getSatisfiesPZS() {
        return this.satisfiesPZS;
    }
    /**
     * The URI of this bucket.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * The bucket's default storage class, used whenever no storageClass is specified for a newly-created object. This defines how objects in the bucket are stored and determines the SLA and the cost of storage. Values include MULTI_REGIONAL, REGIONAL, STANDARD, NEARLINE, COLDLINE, ARCHIVE, and DURABLE_REDUCED_AVAILABILITY. If this value is not specified when the bucket is created, it will default to STANDARD. For more information, see storage classes.
     * 
     */
    public String getStorageClass() {
        return this.storageClass;
    }
    /**
     * The creation time of the bucket in RFC 3339 format.
     * 
     */
    public String getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * The modification time of the bucket in RFC 3339 format.
     * 
     */
    public String getUpdated() {
        return this.updated;
    }
    /**
     * The bucket's versioning configuration.
     * 
     */
    public BucketVersioningResponse getVersioning() {
        return this.versioning;
    }
    /**
     * The bucket's website configuration, controlling how the service behaves when accessing bucket contents as a web site. See the Static Website Examples for more information.
     * 
     */
    public BucketWebsiteResponse getWebsite() {
        return this.website;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BucketAccessControlResponse> acl;
        private BucketAutoclassResponse autoclass;
        private BucketBillingResponse billing;
        private List<BucketCorsItemResponse> cors;
        private BucketCustomPlacementConfigResponse customPlacementConfig;
        private Boolean defaultEventBasedHold;
        private List<ObjectAccessControlResponse> defaultObjectAcl;
        private BucketEncryptionResponse encryption;
        private String etag;
        private BucketIamConfigurationResponse iamConfiguration;
        private String kind;
        private Map<String,String> labels;
        private BucketLifecycleResponse lifecycle;
        private String location;
        private String locationType;
        private BucketLoggingResponse logging;
        private String metageneration;
        private String name;
        private BucketOwnerResponse owner;
        private String projectNumber;
        private BucketRetentionPolicyResponse retentionPolicy;
        private String rpo;
        private Boolean satisfiesPZS;
        private String selfLink;
        private String storageClass;
        private String timeCreated;
        private String updated;
        private BucketVersioningResponse versioning;
        private BucketWebsiteResponse website;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acl = defaults.acl;
    	      this.autoclass = defaults.autoclass;
    	      this.billing = defaults.billing;
    	      this.cors = defaults.cors;
    	      this.customPlacementConfig = defaults.customPlacementConfig;
    	      this.defaultEventBasedHold = defaults.defaultEventBasedHold;
    	      this.defaultObjectAcl = defaults.defaultObjectAcl;
    	      this.encryption = defaults.encryption;
    	      this.etag = defaults.etag;
    	      this.iamConfiguration = defaults.iamConfiguration;
    	      this.kind = defaults.kind;
    	      this.labels = defaults.labels;
    	      this.lifecycle = defaults.lifecycle;
    	      this.location = defaults.location;
    	      this.locationType = defaults.locationType;
    	      this.logging = defaults.logging;
    	      this.metageneration = defaults.metageneration;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.projectNumber = defaults.projectNumber;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.rpo = defaults.rpo;
    	      this.satisfiesPZS = defaults.satisfiesPZS;
    	      this.selfLink = defaults.selfLink;
    	      this.storageClass = defaults.storageClass;
    	      this.timeCreated = defaults.timeCreated;
    	      this.updated = defaults.updated;
    	      this.versioning = defaults.versioning;
    	      this.website = defaults.website;
        }

        public Builder setAcl(List<BucketAccessControlResponse> acl) {
            this.acl = Objects.requireNonNull(acl);
            return this;
        }

        public Builder setAutoclass(BucketAutoclassResponse autoclass) {
            this.autoclass = Objects.requireNonNull(autoclass);
            return this;
        }

        public Builder setBilling(BucketBillingResponse billing) {
            this.billing = Objects.requireNonNull(billing);
            return this;
        }

        public Builder setCors(List<BucketCorsItemResponse> cors) {
            this.cors = Objects.requireNonNull(cors);
            return this;
        }

        public Builder setCustomPlacementConfig(BucketCustomPlacementConfigResponse customPlacementConfig) {
            this.customPlacementConfig = Objects.requireNonNull(customPlacementConfig);
            return this;
        }

        public Builder setDefaultEventBasedHold(Boolean defaultEventBasedHold) {
            this.defaultEventBasedHold = Objects.requireNonNull(defaultEventBasedHold);
            return this;
        }

        public Builder setDefaultObjectAcl(List<ObjectAccessControlResponse> defaultObjectAcl) {
            this.defaultObjectAcl = Objects.requireNonNull(defaultObjectAcl);
            return this;
        }

        public Builder setEncryption(BucketEncryptionResponse encryption) {
            this.encryption = Objects.requireNonNull(encryption);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setIamConfiguration(BucketIamConfigurationResponse iamConfiguration) {
            this.iamConfiguration = Objects.requireNonNull(iamConfiguration);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLifecycle(BucketLifecycleResponse lifecycle) {
            this.lifecycle = Objects.requireNonNull(lifecycle);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocationType(String locationType) {
            this.locationType = Objects.requireNonNull(locationType);
            return this;
        }

        public Builder setLogging(BucketLoggingResponse logging) {
            this.logging = Objects.requireNonNull(logging);
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

        public Builder setOwner(BucketOwnerResponse owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }

        public Builder setProjectNumber(String projectNumber) {
            this.projectNumber = Objects.requireNonNull(projectNumber);
            return this;
        }

        public Builder setRetentionPolicy(BucketRetentionPolicyResponse retentionPolicy) {
            this.retentionPolicy = Objects.requireNonNull(retentionPolicy);
            return this;
        }

        public Builder setRpo(String rpo) {
            this.rpo = Objects.requireNonNull(rpo);
            return this;
        }

        public Builder setSatisfiesPZS(Boolean satisfiesPZS) {
            this.satisfiesPZS = Objects.requireNonNull(satisfiesPZS);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setStorageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }

        public Builder setTimeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }

        public Builder setUpdated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }

        public Builder setVersioning(BucketVersioningResponse versioning) {
            this.versioning = Objects.requireNonNull(versioning);
            return this;
        }

        public Builder setWebsite(BucketWebsiteResponse website) {
            this.website = Objects.requireNonNull(website);
            return this;
        }
        public GetBucketResult build() {
            return new GetBucketResult(acl, autoclass, billing, cors, customPlacementConfig, defaultEventBasedHold, defaultObjectAcl, encryption, etag, iamConfiguration, kind, labels, lifecycle, location, locationType, logging, metageneration, name, owner, projectNumber, retentionPolicy, rpo, satisfiesPZS, selfLink, storageClass, timeCreated, updated, versioning, website);
        }
    }
}
