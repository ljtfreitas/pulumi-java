// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterInstanceArgs Empty = new ClusterInstanceArgs();

    /**
     * Specifies whether any database modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    @InputImport(name="applyImmediately")
    private final @Nullable Input<Boolean> applyImmediately;

    public Input<Boolean> getApplyImmediately() {
        return this.applyImmediately == null ? Input.empty() : this.applyImmediately;
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
     * 
     */
    @InputImport(name="autoMinorVersionUpgrade")
    private final @Nullable Input<Boolean> autoMinorVersionUpgrade;

    public Input<Boolean> getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade == null ? Input.empty() : this.autoMinorVersionUpgrade;
    }

    /**
     * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_CreateDBInstance.html) about the details.
     * 
     */
    @InputImport(name="availabilityZone")
    private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    /**
     * (Optional) The identifier of the CA certificate for the DB instance.
     * 
     */
    @InputImport(name="caCertIdentifier")
    private final @Nullable Input<String> caCertIdentifier;

    public Input<String> getCaCertIdentifier() {
        return this.caCertIdentifier == null ? Input.empty() : this.caCertIdentifier;
    }

    /**
     * The identifier of the `aws.docdb.Cluster` in which to launch this instance.
     * 
     */
    @InputImport(name="clusterIdentifier", required=true)
    private final Input<String> clusterIdentifier;

    public Input<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The name of the database engine to be used for the DocDB instance. Defaults to `docdb`. Valid Values: `docdb`.
     * 
     */
    @InputImport(name="engine")
    private final @Nullable Input<String> engine;

    public Input<String> getEngine() {
        return this.engine == null ? Input.empty() : this.engine;
    }

    /**
     * The identifier for the DocDB instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    @InputImport(name="identifier")
    private final @Nullable Input<String> identifier;

    public Input<String> getIdentifier() {
        return this.identifier == null ? Input.empty() : this.identifier;
    }

    /**
     * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    @InputImport(name="identifierPrefix")
    private final @Nullable Input<String> identifierPrefix;

    public Input<String> getIdentifierPrefix() {
        return this.identifierPrefix == null ? Input.empty() : this.identifierPrefix;
    }

    /**
     * The instance class to use. For details on CPU and memory, see [Scaling for DocDB Instances](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-manage-performance.html#db-cluster-manage-scaling-instance). DocDB currently
     * supports the below instance classes. Please see [AWS Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-classes.html#db-instance-class-specs) for complete details.
     * - db.r5.large
     * - db.r5.xlarge
     * - db.r5.2xlarge
     * - db.r5.4xlarge
     * - db.r5.12xlarge
     * - db.r5.24xlarge
     * - db.r4.large
     * - db.r4.xlarge
     * - db.r4.2xlarge
     * - db.r4.4xlarge
     * - db.r4.8xlarge
     * - db.r4.16xlarge
     * - db.t3.medium
     * 
     */
    @InputImport(name="instanceClass", required=true)
    private final Input<String> instanceClass;

    public Input<String> getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * The window to perform maintenance in.
     * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
     * 
     */
    @InputImport(name="preferredMaintenanceWindow")
    private final @Nullable Input<String> preferredMaintenanceWindow;

    public Input<String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow == null ? Input.empty() : this.preferredMaintenanceWindow;
    }

    /**
     * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
     * 
     */
    @InputImport(name="promotionTier")
    private final @Nullable Input<Integer> promotionTier;

    public Input<Integer> getPromotionTier() {
        return this.promotionTier == null ? Input.empty() : this.promotionTier;
    }

    /**
     * A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ClusterInstanceArgs(
        @Nullable Input<Boolean> applyImmediately,
        @Nullable Input<Boolean> autoMinorVersionUpgrade,
        @Nullable Input<String> availabilityZone,
        @Nullable Input<String> caCertIdentifier,
        Input<String> clusterIdentifier,
        @Nullable Input<String> engine,
        @Nullable Input<String> identifier,
        @Nullable Input<String> identifierPrefix,
        Input<String> instanceClass,
        @Nullable Input<String> preferredMaintenanceWindow,
        @Nullable Input<Integer> promotionTier,
        @Nullable Input<Map<String,String>> tags) {
        this.applyImmediately = applyImmediately;
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        this.availabilityZone = availabilityZone;
        this.caCertIdentifier = caCertIdentifier;
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
        this.engine = engine;
        this.identifier = identifier;
        this.identifierPrefix = identifierPrefix;
        this.instanceClass = Objects.requireNonNull(instanceClass, "expected parameter 'instanceClass' to be non-null");
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        this.promotionTier = promotionTier;
        this.tags = tags;
    }

    private ClusterInstanceArgs() {
        this.applyImmediately = Input.empty();
        this.autoMinorVersionUpgrade = Input.empty();
        this.availabilityZone = Input.empty();
        this.caCertIdentifier = Input.empty();
        this.clusterIdentifier = Input.empty();
        this.engine = Input.empty();
        this.identifier = Input.empty();
        this.identifierPrefix = Input.empty();
        this.instanceClass = Input.empty();
        this.preferredMaintenanceWindow = Input.empty();
        this.promotionTier = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> applyImmediately;
        private @Nullable Input<Boolean> autoMinorVersionUpgrade;
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<String> caCertIdentifier;
        private Input<String> clusterIdentifier;
        private @Nullable Input<String> engine;
        private @Nullable Input<String> identifier;
        private @Nullable Input<String> identifierPrefix;
        private Input<String> instanceClass;
        private @Nullable Input<String> preferredMaintenanceWindow;
        private @Nullable Input<Integer> promotionTier;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyImmediately = defaults.applyImmediately;
    	      this.autoMinorVersionUpgrade = defaults.autoMinorVersionUpgrade;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.caCertIdentifier = defaults.caCertIdentifier;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.engine = defaults.engine;
    	      this.identifier = defaults.identifier;
    	      this.identifierPrefix = defaults.identifierPrefix;
    	      this.instanceClass = defaults.instanceClass;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.promotionTier = defaults.promotionTier;
    	      this.tags = defaults.tags;
        }

        public Builder setApplyImmediately(@Nullable Input<Boolean> applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }

        public Builder setApplyImmediately(@Nullable Boolean applyImmediately) {
            this.applyImmediately = Input.ofNullable(applyImmediately);
            return this;
        }

        public Builder setAutoMinorVersionUpgrade(@Nullable Input<Boolean> autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }

        public Builder setAutoMinorVersionUpgrade(@Nullable Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = Input.ofNullable(autoMinorVersionUpgrade);
            return this;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder setCaCertIdentifier(@Nullable Input<String> caCertIdentifier) {
            this.caCertIdentifier = caCertIdentifier;
            return this;
        }

        public Builder setCaCertIdentifier(@Nullable String caCertIdentifier) {
            this.caCertIdentifier = Input.ofNullable(caCertIdentifier);
            return this;
        }

        public Builder setClusterIdentifier(Input<String> clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public Builder setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Input.of(Objects.requireNonNull(clusterIdentifier));
            return this;
        }

        public Builder setEngine(@Nullable Input<String> engine) {
            this.engine = engine;
            return this;
        }

        public Builder setEngine(@Nullable String engine) {
            this.engine = Input.ofNullable(engine);
            return this;
        }

        public Builder setIdentifier(@Nullable Input<String> identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder setIdentifier(@Nullable String identifier) {
            this.identifier = Input.ofNullable(identifier);
            return this;
        }

        public Builder setIdentifierPrefix(@Nullable Input<String> identifierPrefix) {
            this.identifierPrefix = identifierPrefix;
            return this;
        }

        public Builder setIdentifierPrefix(@Nullable String identifierPrefix) {
            this.identifierPrefix = Input.ofNullable(identifierPrefix);
            return this;
        }

        public Builder setInstanceClass(Input<String> instanceClass) {
            this.instanceClass = Objects.requireNonNull(instanceClass);
            return this;
        }

        public Builder setInstanceClass(String instanceClass) {
            this.instanceClass = Input.of(Objects.requireNonNull(instanceClass));
            return this;
        }

        public Builder setPreferredMaintenanceWindow(@Nullable Input<String> preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        public Builder setPreferredMaintenanceWindow(@Nullable String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Input.ofNullable(preferredMaintenanceWindow);
            return this;
        }

        public Builder setPromotionTier(@Nullable Input<Integer> promotionTier) {
            this.promotionTier = promotionTier;
            return this;
        }

        public Builder setPromotionTier(@Nullable Integer promotionTier) {
            this.promotionTier = Input.ofNullable(promotionTier);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ClusterInstanceArgs build() {
            return new ClusterInstanceArgs(applyImmediately, autoMinorVersionUpgrade, availabilityZone, caCertIdentifier, clusterIdentifier, engine, identifier, identifierPrefix, instanceClass, preferredMaintenanceWindow, promotionTier, tags);
        }
    }
}
