// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetServiceResult {
    /**
     * The ARN of the ECS Service
     * 
     */
    private final String arn;
    private final String clusterArn;
    /**
     * The number of tasks for the ECS Service
     * 
     */
    private final Integer desiredCount;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The launch type for the ECS Service
     * 
     */
    private final String launchType;
    /**
     * The scheduling strategy for the ECS Service
     * 
     */
    private final String schedulingStrategy;
    private final String serviceName;
    /**
     * The family for the latest ACTIVE revision
     * 
     */
    private final String taskDefinition;

    @OutputCustomType.Constructor({"arn","clusterArn","desiredCount","id","launchType","schedulingStrategy","serviceName","taskDefinition"})
    private GetServiceResult(
        String arn,
        String clusterArn,
        Integer desiredCount,
        String id,
        String launchType,
        String schedulingStrategy,
        String serviceName,
        String taskDefinition) {
        this.arn = Objects.requireNonNull(arn);
        this.clusterArn = Objects.requireNonNull(clusterArn);
        this.desiredCount = Objects.requireNonNull(desiredCount);
        this.id = Objects.requireNonNull(id);
        this.launchType = Objects.requireNonNull(launchType);
        this.schedulingStrategy = Objects.requireNonNull(schedulingStrategy);
        this.serviceName = Objects.requireNonNull(serviceName);
        this.taskDefinition = Objects.requireNonNull(taskDefinition);
    }

    /**
     * The ARN of the ECS Service
     * 
     */
    public String getArn() {
        return this.arn;
    }
    public String getClusterArn() {
        return this.clusterArn;
    }
    /**
     * The number of tasks for the ECS Service
     * 
     */
    public Integer getDesiredCount() {
        return this.desiredCount;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The launch type for the ECS Service
     * 
     */
    public String getLaunchType() {
        return this.launchType;
    }
    /**
     * The scheduling strategy for the ECS Service
     * 
     */
    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
    }
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * The family for the latest ACTIVE revision
     * 
     */
    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String clusterArn;
        private Integer desiredCount;
        private String id;
        private String launchType;
        private String schedulingStrategy;
        private String serviceName;
        private String taskDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clusterArn = defaults.clusterArn;
    	      this.desiredCount = defaults.desiredCount;
    	      this.id = defaults.id;
    	      this.launchType = defaults.launchType;
    	      this.schedulingStrategy = defaults.schedulingStrategy;
    	      this.serviceName = defaults.serviceName;
    	      this.taskDefinition = defaults.taskDefinition;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setClusterArn(String clusterArn) {
            this.clusterArn = Objects.requireNonNull(clusterArn);
            return this;
        }

        public Builder setDesiredCount(Integer desiredCount) {
            this.desiredCount = Objects.requireNonNull(desiredCount);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLaunchType(String launchType) {
            this.launchType = Objects.requireNonNull(launchType);
            return this;
        }

        public Builder setSchedulingStrategy(String schedulingStrategy) {
            this.schedulingStrategy = Objects.requireNonNull(schedulingStrategy);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setTaskDefinition(String taskDefinition) {
            this.taskDefinition = Objects.requireNonNull(taskDefinition);
            return this;
        }
        public GetServiceResult build() {
            return new GetServiceResult(arn, clusterArn, desiredCount, id, launchType, schedulingStrategy, serviceName, taskDefinition);
        }
    }
}
