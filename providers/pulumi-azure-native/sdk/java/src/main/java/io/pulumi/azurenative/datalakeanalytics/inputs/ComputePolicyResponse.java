// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Data Lake Analytics compute policy information.
 * 
 */
public final class ComputePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputePolicyResponse Empty = new ComputePolicyResponse();

    /**
     * The resource identifier.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The maximum degree of parallelism per job this user can use to submit jobs.
     * 
     */
    @Import(name="maxDegreeOfParallelismPerJob", required=true)
      private final Integer maxDegreeOfParallelismPerJob;

    public Integer getMaxDegreeOfParallelismPerJob() {
        return this.maxDegreeOfParallelismPerJob;
    }

    /**
     * The minimum priority per job this user can use to submit jobs.
     * 
     */
    @Import(name="minPriorityPerJob", required=true)
      private final Integer minPriorityPerJob;

    public Integer getMinPriorityPerJob() {
        return this.minPriorityPerJob;
    }

    /**
     * The resource name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The AAD object identifier for the entity to create a policy for.
     * 
     */
    @Import(name="objectId", required=true)
      private final String objectId;

    public String getObjectId() {
        return this.objectId;
    }

    /**
     * The type of AAD object the object identifier refers to.
     * 
     */
    @Import(name="objectType", required=true)
      private final String objectType;

    public String getObjectType() {
        return this.objectType;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ComputePolicyResponse(
        String id,
        Integer maxDegreeOfParallelismPerJob,
        Integer minPriorityPerJob,
        String name,
        String objectId,
        String objectType,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.maxDegreeOfParallelismPerJob = Objects.requireNonNull(maxDegreeOfParallelismPerJob, "expected parameter 'maxDegreeOfParallelismPerJob' to be non-null");
        this.minPriorityPerJob = Objects.requireNonNull(minPriorityPerJob, "expected parameter 'minPriorityPerJob' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ComputePolicyResponse() {
        this.id = null;
        this.maxDegreeOfParallelismPerJob = null;
        this.minPriorityPerJob = null;
        this.name = null;
        this.objectId = null;
        this.objectType = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private Integer maxDegreeOfParallelismPerJob;
        private Integer minPriorityPerJob;
        private String name;
        private String objectId;
        private String objectType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.maxDegreeOfParallelismPerJob = defaults.maxDegreeOfParallelismPerJob;
    	      this.minPriorityPerJob = defaults.minPriorityPerJob;
    	      this.name = defaults.name;
    	      this.objectId = defaults.objectId;
    	      this.objectType = defaults.objectType;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder maxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
            this.maxDegreeOfParallelismPerJob = Objects.requireNonNull(maxDegreeOfParallelismPerJob);
            return this;
        }

        public Builder minPriorityPerJob(Integer minPriorityPerJob) {
            this.minPriorityPerJob = Objects.requireNonNull(minPriorityPerJob);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ComputePolicyResponse build() {
            return new ComputePolicyResponse(id, maxDegreeOfParallelismPerJob, minPriorityPerJob, name, objectId, objectType, type);
        }
    }
}
