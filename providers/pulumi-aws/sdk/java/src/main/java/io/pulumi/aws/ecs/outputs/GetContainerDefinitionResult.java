// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetContainerDefinitionResult {
    private final String containerName;
    /**
     * The CPU limit for this container definition
     * 
     */
    private final Integer cpu;
    /**
     * Indicator if networking is disabled
     * 
     */
    private final Boolean disableNetworking;
    /**
     * Set docker labels
     * 
     */
    private final Map<String,String> dockerLabels;
    /**
     * The environment in use
     * 
     */
    private final Map<String,String> environment;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The docker image in use, including the digest
     * 
     */
    private final String image;
    /**
     * The digest of the docker image in use
     * 
     */
    private final String imageDigest;
    /**
     * The memory limit for this container definition
     * 
     */
    private final Integer memory;
    /**
     * The soft limit (in MiB) of memory to reserve for the container. When system memory is under contention, Docker attempts to keep the container memory to this soft limit
     * 
     */
    private final Integer memoryReservation;
    private final String taskDefinition;

    @CustomType.Constructor
    private GetContainerDefinitionResult(
        @CustomType.Parameter("containerName") String containerName,
        @CustomType.Parameter("cpu") Integer cpu,
        @CustomType.Parameter("disableNetworking") Boolean disableNetworking,
        @CustomType.Parameter("dockerLabels") Map<String,String> dockerLabels,
        @CustomType.Parameter("environment") Map<String,String> environment,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("image") String image,
        @CustomType.Parameter("imageDigest") String imageDigest,
        @CustomType.Parameter("memory") Integer memory,
        @CustomType.Parameter("memoryReservation") Integer memoryReservation,
        @CustomType.Parameter("taskDefinition") String taskDefinition) {
        this.containerName = containerName;
        this.cpu = cpu;
        this.disableNetworking = disableNetworking;
        this.dockerLabels = dockerLabels;
        this.environment = environment;
        this.id = id;
        this.image = image;
        this.imageDigest = imageDigest;
        this.memory = memory;
        this.memoryReservation = memoryReservation;
        this.taskDefinition = taskDefinition;
    }

    public String getContainerName() {
        return this.containerName;
    }
    /**
     * The CPU limit for this container definition
     * 
    */
    public Integer getCpu() {
        return this.cpu;
    }
    /**
     * Indicator if networking is disabled
     * 
    */
    public Boolean getDisableNetworking() {
        return this.disableNetworking;
    }
    /**
     * Set docker labels
     * 
    */
    public Map<String,String> getDockerLabels() {
        return this.dockerLabels;
    }
    /**
     * The environment in use
     * 
    */
    public Map<String,String> getEnvironment() {
        return this.environment;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The docker image in use, including the digest
     * 
    */
    public String getImage() {
        return this.image;
    }
    /**
     * The digest of the docker image in use
     * 
    */
    public String getImageDigest() {
        return this.imageDigest;
    }
    /**
     * The memory limit for this container definition
     * 
    */
    public Integer getMemory() {
        return this.memory;
    }
    /**
     * The soft limit (in MiB) of memory to reserve for the container. When system memory is under contention, Docker attempts to keep the container memory to this soft limit
     * 
    */
    public Integer getMemoryReservation() {
        return this.memoryReservation;
    }
    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private Integer cpu;
        private Boolean disableNetworking;
        private Map<String,String> dockerLabels;
        private Map<String,String> environment;
        private String id;
        private String image;
        private String imageDigest;
        private Integer memory;
        private Integer memoryReservation;
        private String taskDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.cpu = defaults.cpu;
    	      this.disableNetworking = defaults.disableNetworking;
    	      this.dockerLabels = defaults.dockerLabels;
    	      this.environment = defaults.environment;
    	      this.id = defaults.id;
    	      this.image = defaults.image;
    	      this.imageDigest = defaults.imageDigest;
    	      this.memory = defaults.memory;
    	      this.memoryReservation = defaults.memoryReservation;
    	      this.taskDefinition = defaults.taskDefinition;
        }

        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder cpu(Integer cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder disableNetworking(Boolean disableNetworking) {
            this.disableNetworking = Objects.requireNonNull(disableNetworking);
            return this;
        }

        public Builder dockerLabels(Map<String,String> dockerLabels) {
            this.dockerLabels = Objects.requireNonNull(dockerLabels);
            return this;
        }

        public Builder environment(Map<String,String> environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder imageDigest(String imageDigest) {
            this.imageDigest = Objects.requireNonNull(imageDigest);
            return this;
        }

        public Builder memory(Integer memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }

        public Builder memoryReservation(Integer memoryReservation) {
            this.memoryReservation = Objects.requireNonNull(memoryReservation);
            return this;
        }

        public Builder taskDefinition(String taskDefinition) {
            this.taskDefinition = Objects.requireNonNull(taskDefinition);
            return this;
        }
        public GetContainerDefinitionResult build() {
            return new GetContainerDefinitionResult(containerName, cpu, disableNetworking, dockerLabels, environment, id, image, imageDigest, memory, memoryReservation, taskDefinition);
        }
    }
}
