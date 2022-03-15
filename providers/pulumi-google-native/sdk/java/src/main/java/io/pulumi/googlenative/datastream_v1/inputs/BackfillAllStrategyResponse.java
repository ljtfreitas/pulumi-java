// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datastream_v1.inputs.MysqlRdbmsResponse;
import io.pulumi.googlenative.datastream_v1.inputs.OracleRdbmsResponse;
import java.util.Objects;


/**
 * Backfill strategy to automatically backfill the Stream's objects. Specific objects can be excluded.
 * 
 */
public final class BackfillAllStrategyResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackfillAllStrategyResponse Empty = new BackfillAllStrategyResponse();

    /**
     * MySQL data source objects to avoid backfilling.
     * 
     */
    @Import(name="mysqlExcludedObjects", required=true)
      private final MysqlRdbmsResponse mysqlExcludedObjects;

    public MysqlRdbmsResponse getMysqlExcludedObjects() {
        return this.mysqlExcludedObjects;
    }

    /**
     * Oracle data source objects to avoid backfilling.
     * 
     */
    @Import(name="oracleExcludedObjects", required=true)
      private final OracleRdbmsResponse oracleExcludedObjects;

    public OracleRdbmsResponse getOracleExcludedObjects() {
        return this.oracleExcludedObjects;
    }

    public BackfillAllStrategyResponse(
        MysqlRdbmsResponse mysqlExcludedObjects,
        OracleRdbmsResponse oracleExcludedObjects) {
        this.mysqlExcludedObjects = Objects.requireNonNull(mysqlExcludedObjects, "expected parameter 'mysqlExcludedObjects' to be non-null");
        this.oracleExcludedObjects = Objects.requireNonNull(oracleExcludedObjects, "expected parameter 'oracleExcludedObjects' to be non-null");
    }

    private BackfillAllStrategyResponse() {
        this.mysqlExcludedObjects = null;
        this.oracleExcludedObjects = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackfillAllStrategyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlRdbmsResponse mysqlExcludedObjects;
        private OracleRdbmsResponse oracleExcludedObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(BackfillAllStrategyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlExcludedObjects = defaults.mysqlExcludedObjects;
    	      this.oracleExcludedObjects = defaults.oracleExcludedObjects;
        }

        public Builder mysqlExcludedObjects(MysqlRdbmsResponse mysqlExcludedObjects) {
            this.mysqlExcludedObjects = Objects.requireNonNull(mysqlExcludedObjects);
            return this;
        }

        public Builder oracleExcludedObjects(OracleRdbmsResponse oracleExcludedObjects) {
            this.oracleExcludedObjects = Objects.requireNonNull(oracleExcludedObjects);
            return this;
        }
        public BackfillAllStrategyResponse build() {
            return new BackfillAllStrategyResponse(mysqlExcludedObjects, oracleExcludedObjects);
        }
    }
}
