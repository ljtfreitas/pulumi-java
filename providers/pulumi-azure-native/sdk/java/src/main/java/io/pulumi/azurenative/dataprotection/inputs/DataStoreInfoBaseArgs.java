// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.enums.DataStoreTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * DataStoreInfo base
 * 
 */
public final class DataStoreInfoBaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataStoreInfoBaseArgs Empty = new DataStoreInfoBaseArgs();

    /**
     * type of datastore; Operational/Vault/Archive
     * 
     */
    @InputImport(name="dataStoreType", required=true)
    private final Input<Either<String,DataStoreTypes>> dataStoreType;

    public Input<Either<String,DataStoreTypes>> getDataStoreType() {
        return this.dataStoreType;
    }

    /**
     * Type of Datasource object, used to initialize the right inherited type
     * 
     */
    @InputImport(name="objectType", required=true)
    private final Input<String> objectType;

    public Input<String> getObjectType() {
        return this.objectType;
    }

    public DataStoreInfoBaseArgs(
        Input<Either<String,DataStoreTypes>> dataStoreType,
        Input<String> objectType) {
        this.dataStoreType = Objects.requireNonNull(dataStoreType, "expected parameter 'dataStoreType' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
    }

    private DataStoreInfoBaseArgs() {
        this.dataStoreType = Input.empty();
        this.objectType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataStoreInfoBaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,DataStoreTypes>> dataStoreType;
        private Input<String> objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataStoreInfoBaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataStoreType = defaults.dataStoreType;
    	      this.objectType = defaults.objectType;
        }

        public Builder setDataStoreType(Input<Either<String,DataStoreTypes>> dataStoreType) {
            this.dataStoreType = Objects.requireNonNull(dataStoreType);
            return this;
        }

        public Builder setDataStoreType(Either<String,DataStoreTypes> dataStoreType) {
            this.dataStoreType = Input.of(Objects.requireNonNull(dataStoreType));
            return this;
        }

        public Builder setObjectType(Input<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Input.of(Objects.requireNonNull(objectType));
            return this;
        }

        public DataStoreInfoBaseArgs build() {
            return new DataStoreInfoBaseArgs(dataStoreType, objectType);
        }
    }
}
