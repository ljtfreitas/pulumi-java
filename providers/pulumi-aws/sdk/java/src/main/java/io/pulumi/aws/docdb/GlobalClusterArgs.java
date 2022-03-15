// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalClusterArgs Empty = new GlobalClusterArgs();

    /**
     * Name for an automatically created database on cluster creation.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName == null ? Output.empty() : this.databaseName;
    }

    /**
     * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Output.empty() : this.deletionProtection;
    }

    @Import(name="engine")
      private final @Nullable Output<String> engine;

    public Output<String> getEngine() {
        return this.engine == null ? Output.empty() : this.engine;
    }

    /**
     * Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
     * * **NOTE:** Upgrading major versions is not supported.
     * 
     */
    @Import(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> getEngineVersion() {
        return this.engineVersion == null ? Output.empty() : this.engineVersion;
    }

    /**
     * The global cluster identifier.
     * 
     */
    @Import(name="globalClusterIdentifier", required=true)
      private final Output<String> globalClusterIdentifier;

    public Output<String> getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    @Import(name="sourceDbClusterIdentifier")
      private final @Nullable Output<String> sourceDbClusterIdentifier;

    public Output<String> getSourceDbClusterIdentifier() {
        return this.sourceDbClusterIdentifier == null ? Output.empty() : this.sourceDbClusterIdentifier;
    }

    @Import(name="storageEncrypted")
      private final @Nullable Output<Boolean> storageEncrypted;

    public Output<Boolean> getStorageEncrypted() {
        return this.storageEncrypted == null ? Output.empty() : this.storageEncrypted;
    }

    public GlobalClusterArgs(
        @Nullable Output<String> databaseName,
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<String> engine,
        @Nullable Output<String> engineVersion,
        Output<String> globalClusterIdentifier,
        @Nullable Output<String> sourceDbClusterIdentifier,
        @Nullable Output<Boolean> storageEncrypted) {
        this.databaseName = databaseName;
        this.deletionProtection = deletionProtection;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.globalClusterIdentifier = Objects.requireNonNull(globalClusterIdentifier, "expected parameter 'globalClusterIdentifier' to be non-null");
        this.sourceDbClusterIdentifier = sourceDbClusterIdentifier;
        this.storageEncrypted = storageEncrypted;
    }

    private GlobalClusterArgs() {
        this.databaseName = Output.empty();
        this.deletionProtection = Output.empty();
        this.engine = Output.empty();
        this.engineVersion = Output.empty();
        this.globalClusterIdentifier = Output.empty();
        this.sourceDbClusterIdentifier = Output.empty();
        this.storageEncrypted = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> databaseName;
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<String> engine;
        private @Nullable Output<String> engineVersion;
        private Output<String> globalClusterIdentifier;
        private @Nullable Output<String> sourceDbClusterIdentifier;
        private @Nullable Output<Boolean> storageEncrypted;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.globalClusterIdentifier = defaults.globalClusterIdentifier;
    	      this.sourceDbClusterIdentifier = defaults.sourceDbClusterIdentifier;
    	      this.storageEncrypted = defaults.storageEncrypted;
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Output.ofNullable(databaseName);
            return this;
        }

        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Output.ofNullable(deletionProtection);
            return this;
        }

        public Builder engine(@Nullable Output<String> engine) {
            this.engine = engine;
            return this;
        }

        public Builder engine(@Nullable String engine) {
            this.engine = Output.ofNullable(engine);
            return this;
        }

        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = Output.ofNullable(engineVersion);
            return this;
        }

        public Builder globalClusterIdentifier(Output<String> globalClusterIdentifier) {
            this.globalClusterIdentifier = Objects.requireNonNull(globalClusterIdentifier);
            return this;
        }

        public Builder globalClusterIdentifier(String globalClusterIdentifier) {
            this.globalClusterIdentifier = Output.of(Objects.requireNonNull(globalClusterIdentifier));
            return this;
        }

        public Builder sourceDbClusterIdentifier(@Nullable Output<String> sourceDbClusterIdentifier) {
            this.sourceDbClusterIdentifier = sourceDbClusterIdentifier;
            return this;
        }

        public Builder sourceDbClusterIdentifier(@Nullable String sourceDbClusterIdentifier) {
            this.sourceDbClusterIdentifier = Output.ofNullable(sourceDbClusterIdentifier);
            return this;
        }

        public Builder storageEncrypted(@Nullable Output<Boolean> storageEncrypted) {
            this.storageEncrypted = storageEncrypted;
            return this;
        }

        public Builder storageEncrypted(@Nullable Boolean storageEncrypted) {
            this.storageEncrypted = Output.ofNullable(storageEncrypted);
            return this;
        }
        public GlobalClusterArgs build() {
            return new GlobalClusterArgs(databaseName, deletionProtection, engine, engineVersion, globalClusterIdentifier, sourceDbClusterIdentifier, storageEncrypted);
        }
    }
}
