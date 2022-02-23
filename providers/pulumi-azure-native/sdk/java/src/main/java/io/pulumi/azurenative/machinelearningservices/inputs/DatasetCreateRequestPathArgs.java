// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.DatasetCreateRequestDataPathArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetCreateRequestPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetCreateRequestPathArgs Empty = new DatasetCreateRequestPathArgs();

    @InputImport(name="dataPath")
        private final @Nullable Input<DatasetCreateRequestDataPathArgs> dataPath;

    public Input<DatasetCreateRequestDataPathArgs> getDataPath() {
        return this.dataPath == null ? Input.empty() : this.dataPath;
    }

    /**
     * The Http URL.
     * 
     */
    @InputImport(name="httpUrl")
        private final @Nullable Input<String> httpUrl;

    public Input<String> getHttpUrl() {
        return this.httpUrl == null ? Input.empty() : this.httpUrl;
    }

    public DatasetCreateRequestPathArgs(
        @Nullable Input<DatasetCreateRequestDataPathArgs> dataPath,
        @Nullable Input<String> httpUrl) {
        this.dataPath = dataPath;
        this.httpUrl = httpUrl;
    }

    private DatasetCreateRequestPathArgs() {
        this.dataPath = Input.empty();
        this.httpUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetCreateRequestPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatasetCreateRequestDataPathArgs> dataPath;
        private @Nullable Input<String> httpUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetCreateRequestPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataPath = defaults.dataPath;
    	      this.httpUrl = defaults.httpUrl;
        }

        public Builder setDataPath(@Nullable Input<DatasetCreateRequestDataPathArgs> dataPath) {
            this.dataPath = dataPath;
            return this;
        }

        public Builder setDataPath(@Nullable DatasetCreateRequestDataPathArgs dataPath) {
            this.dataPath = Input.ofNullable(dataPath);
            return this;
        }

        public Builder setHttpUrl(@Nullable Input<String> httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }

        public Builder setHttpUrl(@Nullable String httpUrl) {
            this.httpUrl = Input.ofNullable(httpUrl);
            return this;
        }
        public DatasetCreateRequestPathArgs build() {
            return new DatasetCreateRequestPathArgs(dataPath, httpUrl);
        }
    }
}
