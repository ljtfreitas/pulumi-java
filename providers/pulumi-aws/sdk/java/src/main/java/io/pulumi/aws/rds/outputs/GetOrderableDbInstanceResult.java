// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetOrderableDbInstanceResult {
    private final String availabilityZoneGroup;
    /**
     * Availability zones where the instance is available.
     * 
     */
    private final List<String> availabilityZones;
    private final String engine;
    private final String engineVersion;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String instanceClass;
    private final String licenseModel;
    /**
     * Maximum total provisioned IOPS for a DB instance.
     * 
     */
    private final Integer maxIopsPerDbInstance;
    /**
     * Maximum provisioned IOPS per GiB for a DB instance.
     * 
     */
    private final Double maxIopsPerGib;
    /**
     * Maximum storage size for a DB instance.
     * 
     */
    private final Integer maxStorageSize;
    /**
     * Minimum total provisioned IOPS for a DB instance.
     * 
     */
    private final Integer minIopsPerDbInstance;
    /**
     * Minimum provisioned IOPS per GiB for a DB instance.
     * 
     */
    private final Double minIopsPerGib;
    /**
     * Minimum storage size for a DB instance.
     * 
     */
    private final Integer minStorageSize;
    /**
     * Whether a DB instance is Multi-AZ capable.
     * 
     */
    private final Boolean multiAzCapable;
    /**
     * Whether a DB instance supports RDS on Outposts.
     * 
     */
    private final Boolean outpostCapable;
    private final @Nullable List<String> preferredEngineVersions;
    private final @Nullable List<String> preferredInstanceClasses;
    /**
     * Whether a DB instance can have a read replica.
     * 
     */
    private final Boolean readReplicaCapable;
    private final String storageType;
    /**
     * A list of the supported DB engine modes.
     * 
     */
    private final List<String> supportedEngineModes;
    private final Boolean supportsEnhancedMonitoring;
    private final Boolean supportsGlobalDatabases;
    private final Boolean supportsIamDatabaseAuthentication;
    private final Boolean supportsIops;
    private final Boolean supportsKerberosAuthentication;
    private final Boolean supportsPerformanceInsights;
    private final Boolean supportsStorageAutoscaling;
    private final Boolean supportsStorageEncryption;
    private final Boolean vpc;

    @CustomType.Constructor
    private GetOrderableDbInstanceResult(
        @CustomType.Parameter("availabilityZoneGroup") String availabilityZoneGroup,
        @CustomType.Parameter("availabilityZones") List<String> availabilityZones,
        @CustomType.Parameter("engine") String engine,
        @CustomType.Parameter("engineVersion") String engineVersion,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceClass") String instanceClass,
        @CustomType.Parameter("licenseModel") String licenseModel,
        @CustomType.Parameter("maxIopsPerDbInstance") Integer maxIopsPerDbInstance,
        @CustomType.Parameter("maxIopsPerGib") Double maxIopsPerGib,
        @CustomType.Parameter("maxStorageSize") Integer maxStorageSize,
        @CustomType.Parameter("minIopsPerDbInstance") Integer minIopsPerDbInstance,
        @CustomType.Parameter("minIopsPerGib") Double minIopsPerGib,
        @CustomType.Parameter("minStorageSize") Integer minStorageSize,
        @CustomType.Parameter("multiAzCapable") Boolean multiAzCapable,
        @CustomType.Parameter("outpostCapable") Boolean outpostCapable,
        @CustomType.Parameter("preferredEngineVersions") @Nullable List<String> preferredEngineVersions,
        @CustomType.Parameter("preferredInstanceClasses") @Nullable List<String> preferredInstanceClasses,
        @CustomType.Parameter("readReplicaCapable") Boolean readReplicaCapable,
        @CustomType.Parameter("storageType") String storageType,
        @CustomType.Parameter("supportedEngineModes") List<String> supportedEngineModes,
        @CustomType.Parameter("supportsEnhancedMonitoring") Boolean supportsEnhancedMonitoring,
        @CustomType.Parameter("supportsGlobalDatabases") Boolean supportsGlobalDatabases,
        @CustomType.Parameter("supportsIamDatabaseAuthentication") Boolean supportsIamDatabaseAuthentication,
        @CustomType.Parameter("supportsIops") Boolean supportsIops,
        @CustomType.Parameter("supportsKerberosAuthentication") Boolean supportsKerberosAuthentication,
        @CustomType.Parameter("supportsPerformanceInsights") Boolean supportsPerformanceInsights,
        @CustomType.Parameter("supportsStorageAutoscaling") Boolean supportsStorageAutoscaling,
        @CustomType.Parameter("supportsStorageEncryption") Boolean supportsStorageEncryption,
        @CustomType.Parameter("vpc") Boolean vpc) {
        this.availabilityZoneGroup = availabilityZoneGroup;
        this.availabilityZones = availabilityZones;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.id = id;
        this.instanceClass = instanceClass;
        this.licenseModel = licenseModel;
        this.maxIopsPerDbInstance = maxIopsPerDbInstance;
        this.maxIopsPerGib = maxIopsPerGib;
        this.maxStorageSize = maxStorageSize;
        this.minIopsPerDbInstance = minIopsPerDbInstance;
        this.minIopsPerGib = minIopsPerGib;
        this.minStorageSize = minStorageSize;
        this.multiAzCapable = multiAzCapable;
        this.outpostCapable = outpostCapable;
        this.preferredEngineVersions = preferredEngineVersions;
        this.preferredInstanceClasses = preferredInstanceClasses;
        this.readReplicaCapable = readReplicaCapable;
        this.storageType = storageType;
        this.supportedEngineModes = supportedEngineModes;
        this.supportsEnhancedMonitoring = supportsEnhancedMonitoring;
        this.supportsGlobalDatabases = supportsGlobalDatabases;
        this.supportsIamDatabaseAuthentication = supportsIamDatabaseAuthentication;
        this.supportsIops = supportsIops;
        this.supportsKerberosAuthentication = supportsKerberosAuthentication;
        this.supportsPerformanceInsights = supportsPerformanceInsights;
        this.supportsStorageAutoscaling = supportsStorageAutoscaling;
        this.supportsStorageEncryption = supportsStorageEncryption;
        this.vpc = vpc;
    }

    public String getAvailabilityZoneGroup() {
        return this.availabilityZoneGroup;
    }
    /**
     * Availability zones where the instance is available.
     * 
    */
    public List<String> getAvailabilityZones() {
        return this.availabilityZones;
    }
    public String getEngine() {
        return this.engine;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }
    public String getLicenseModel() {
        return this.licenseModel;
    }
    /**
     * Maximum total provisioned IOPS for a DB instance.
     * 
    */
    public Integer getMaxIopsPerDbInstance() {
        return this.maxIopsPerDbInstance;
    }
    /**
     * Maximum provisioned IOPS per GiB for a DB instance.
     * 
    */
    public Double getMaxIopsPerGib() {
        return this.maxIopsPerGib;
    }
    /**
     * Maximum storage size for a DB instance.
     * 
    */
    public Integer getMaxStorageSize() {
        return this.maxStorageSize;
    }
    /**
     * Minimum total provisioned IOPS for a DB instance.
     * 
    */
    public Integer getMinIopsPerDbInstance() {
        return this.minIopsPerDbInstance;
    }
    /**
     * Minimum provisioned IOPS per GiB for a DB instance.
     * 
    */
    public Double getMinIopsPerGib() {
        return this.minIopsPerGib;
    }
    /**
     * Minimum storage size for a DB instance.
     * 
    */
    public Integer getMinStorageSize() {
        return this.minStorageSize;
    }
    /**
     * Whether a DB instance is Multi-AZ capable.
     * 
    */
    public Boolean getMultiAzCapable() {
        return this.multiAzCapable;
    }
    /**
     * Whether a DB instance supports RDS on Outposts.
     * 
    */
    public Boolean getOutpostCapable() {
        return this.outpostCapable;
    }
    public List<String> getPreferredEngineVersions() {
        return this.preferredEngineVersions == null ? List.of() : this.preferredEngineVersions;
    }
    public List<String> getPreferredInstanceClasses() {
        return this.preferredInstanceClasses == null ? List.of() : this.preferredInstanceClasses;
    }
    /**
     * Whether a DB instance can have a read replica.
     * 
    */
    public Boolean getReadReplicaCapable() {
        return this.readReplicaCapable;
    }
    public String getStorageType() {
        return this.storageType;
    }
    /**
     * A list of the supported DB engine modes.
     * 
    */
    public List<String> getSupportedEngineModes() {
        return this.supportedEngineModes;
    }
    public Boolean getSupportsEnhancedMonitoring() {
        return this.supportsEnhancedMonitoring;
    }
    public Boolean getSupportsGlobalDatabases() {
        return this.supportsGlobalDatabases;
    }
    public Boolean getSupportsIamDatabaseAuthentication() {
        return this.supportsIamDatabaseAuthentication;
    }
    public Boolean getSupportsIops() {
        return this.supportsIops;
    }
    public Boolean getSupportsKerberosAuthentication() {
        return this.supportsKerberosAuthentication;
    }
    public Boolean getSupportsPerformanceInsights() {
        return this.supportsPerformanceInsights;
    }
    public Boolean getSupportsStorageAutoscaling() {
        return this.supportsStorageAutoscaling;
    }
    public Boolean getSupportsStorageEncryption() {
        return this.supportsStorageEncryption;
    }
    public Boolean getVpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrderableDbInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityZoneGroup;
        private List<String> availabilityZones;
        private String engine;
        private String engineVersion;
        private String id;
        private String instanceClass;
        private String licenseModel;
        private Integer maxIopsPerDbInstance;
        private Double maxIopsPerGib;
        private Integer maxStorageSize;
        private Integer minIopsPerDbInstance;
        private Double minIopsPerGib;
        private Integer minStorageSize;
        private Boolean multiAzCapable;
        private Boolean outpostCapable;
        private @Nullable List<String> preferredEngineVersions;
        private @Nullable List<String> preferredInstanceClasses;
        private Boolean readReplicaCapable;
        private String storageType;
        private List<String> supportedEngineModes;
        private Boolean supportsEnhancedMonitoring;
        private Boolean supportsGlobalDatabases;
        private Boolean supportsIamDatabaseAuthentication;
        private Boolean supportsIops;
        private Boolean supportsKerberosAuthentication;
        private Boolean supportsPerformanceInsights;
        private Boolean supportsStorageAutoscaling;
        private Boolean supportsStorageEncryption;
        private Boolean vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrderableDbInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneGroup = defaults.availabilityZoneGroup;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.instanceClass = defaults.instanceClass;
    	      this.licenseModel = defaults.licenseModel;
    	      this.maxIopsPerDbInstance = defaults.maxIopsPerDbInstance;
    	      this.maxIopsPerGib = defaults.maxIopsPerGib;
    	      this.maxStorageSize = defaults.maxStorageSize;
    	      this.minIopsPerDbInstance = defaults.minIopsPerDbInstance;
    	      this.minIopsPerGib = defaults.minIopsPerGib;
    	      this.minStorageSize = defaults.minStorageSize;
    	      this.multiAzCapable = defaults.multiAzCapable;
    	      this.outpostCapable = defaults.outpostCapable;
    	      this.preferredEngineVersions = defaults.preferredEngineVersions;
    	      this.preferredInstanceClasses = defaults.preferredInstanceClasses;
    	      this.readReplicaCapable = defaults.readReplicaCapable;
    	      this.storageType = defaults.storageType;
    	      this.supportedEngineModes = defaults.supportedEngineModes;
    	      this.supportsEnhancedMonitoring = defaults.supportsEnhancedMonitoring;
    	      this.supportsGlobalDatabases = defaults.supportsGlobalDatabases;
    	      this.supportsIamDatabaseAuthentication = defaults.supportsIamDatabaseAuthentication;
    	      this.supportsIops = defaults.supportsIops;
    	      this.supportsKerberosAuthentication = defaults.supportsKerberosAuthentication;
    	      this.supportsPerformanceInsights = defaults.supportsPerformanceInsights;
    	      this.supportsStorageAutoscaling = defaults.supportsStorageAutoscaling;
    	      this.supportsStorageEncryption = defaults.supportsStorageEncryption;
    	      this.vpc = defaults.vpc;
        }

        public Builder availabilityZoneGroup(String availabilityZoneGroup) {
            this.availabilityZoneGroup = Objects.requireNonNull(availabilityZoneGroup);
            return this;
        }

        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }

        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }

        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder instanceClass(String instanceClass) {
            this.instanceClass = Objects.requireNonNull(instanceClass);
            return this;
        }

        public Builder licenseModel(String licenseModel) {
            this.licenseModel = Objects.requireNonNull(licenseModel);
            return this;
        }

        public Builder maxIopsPerDbInstance(Integer maxIopsPerDbInstance) {
            this.maxIopsPerDbInstance = Objects.requireNonNull(maxIopsPerDbInstance);
            return this;
        }

        public Builder maxIopsPerGib(Double maxIopsPerGib) {
            this.maxIopsPerGib = Objects.requireNonNull(maxIopsPerGib);
            return this;
        }

        public Builder maxStorageSize(Integer maxStorageSize) {
            this.maxStorageSize = Objects.requireNonNull(maxStorageSize);
            return this;
        }

        public Builder minIopsPerDbInstance(Integer minIopsPerDbInstance) {
            this.minIopsPerDbInstance = Objects.requireNonNull(minIopsPerDbInstance);
            return this;
        }

        public Builder minIopsPerGib(Double minIopsPerGib) {
            this.minIopsPerGib = Objects.requireNonNull(minIopsPerGib);
            return this;
        }

        public Builder minStorageSize(Integer minStorageSize) {
            this.minStorageSize = Objects.requireNonNull(minStorageSize);
            return this;
        }

        public Builder multiAzCapable(Boolean multiAzCapable) {
            this.multiAzCapable = Objects.requireNonNull(multiAzCapable);
            return this;
        }

        public Builder outpostCapable(Boolean outpostCapable) {
            this.outpostCapable = Objects.requireNonNull(outpostCapable);
            return this;
        }

        public Builder preferredEngineVersions(@Nullable List<String> preferredEngineVersions) {
            this.preferredEngineVersions = preferredEngineVersions;
            return this;
        }

        public Builder preferredInstanceClasses(@Nullable List<String> preferredInstanceClasses) {
            this.preferredInstanceClasses = preferredInstanceClasses;
            return this;
        }

        public Builder readReplicaCapable(Boolean readReplicaCapable) {
            this.readReplicaCapable = Objects.requireNonNull(readReplicaCapable);
            return this;
        }

        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }

        public Builder supportedEngineModes(List<String> supportedEngineModes) {
            this.supportedEngineModes = Objects.requireNonNull(supportedEngineModes);
            return this;
        }

        public Builder supportsEnhancedMonitoring(Boolean supportsEnhancedMonitoring) {
            this.supportsEnhancedMonitoring = Objects.requireNonNull(supportsEnhancedMonitoring);
            return this;
        }

        public Builder supportsGlobalDatabases(Boolean supportsGlobalDatabases) {
            this.supportsGlobalDatabases = Objects.requireNonNull(supportsGlobalDatabases);
            return this;
        }

        public Builder supportsIamDatabaseAuthentication(Boolean supportsIamDatabaseAuthentication) {
            this.supportsIamDatabaseAuthentication = Objects.requireNonNull(supportsIamDatabaseAuthentication);
            return this;
        }

        public Builder supportsIops(Boolean supportsIops) {
            this.supportsIops = Objects.requireNonNull(supportsIops);
            return this;
        }

        public Builder supportsKerberosAuthentication(Boolean supportsKerberosAuthentication) {
            this.supportsKerberosAuthentication = Objects.requireNonNull(supportsKerberosAuthentication);
            return this;
        }

        public Builder supportsPerformanceInsights(Boolean supportsPerformanceInsights) {
            this.supportsPerformanceInsights = Objects.requireNonNull(supportsPerformanceInsights);
            return this;
        }

        public Builder supportsStorageAutoscaling(Boolean supportsStorageAutoscaling) {
            this.supportsStorageAutoscaling = Objects.requireNonNull(supportsStorageAutoscaling);
            return this;
        }

        public Builder supportsStorageEncryption(Boolean supportsStorageEncryption) {
            this.supportsStorageEncryption = Objects.requireNonNull(supportsStorageEncryption);
            return this;
        }

        public Builder vpc(Boolean vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }
        public GetOrderableDbInstanceResult build() {
            return new GetOrderableDbInstanceResult(availabilityZoneGroup, availabilityZones, engine, engineVersion, id, instanceClass, licenseModel, maxIopsPerDbInstance, maxIopsPerGib, maxStorageSize, minIopsPerDbInstance, minIopsPerGib, minStorageSize, multiAzCapable, outpostCapable, preferredEngineVersions, preferredInstanceClasses, readReplicaCapable, storageType, supportedEngineModes, supportsEnhancedMonitoring, supportsGlobalDatabases, supportsIamDatabaseAuthentication, supportsIops, supportsKerberosAuthentication, supportsPerformanceInsights, supportsStorageAutoscaling, supportsStorageEncryption, vpc);
        }
    }
}
