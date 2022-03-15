// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobOutputResponse {
    /**
     * ARM ID of the datastore where the job logs and artifacts are stored, or null for the default container ("azureml") in the workspace's storage account.
     * 
     */
    private final String datastoreId;
    /**
     * Path within the datastore to the job logs and artifacts.
     * 
     */
    private final String path;

    @CustomType.Constructor
    private JobOutputResponse(
        @CustomType.Parameter("datastoreId") String datastoreId,
        @CustomType.Parameter("path") String path) {
        this.datastoreId = datastoreId;
        this.path = path;
    }

    /**
     * ARM ID of the datastore where the job logs and artifacts are stored, or null for the default container ("azureml") in the workspace's storage account.
     * 
    */
    public String getDatastoreId() {
        return this.datastoreId;
    }
    /**
     * Path within the datastore to the job logs and artifacts.
     * 
    */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datastoreId;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(JobOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.path = defaults.path;
        }

        public Builder datastoreId(String datastoreId) {
            this.datastoreId = Objects.requireNonNull(datastoreId);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public JobOutputResponse build() {
            return new JobOutputResponse(datastoreId, path);
        }
    }
}
