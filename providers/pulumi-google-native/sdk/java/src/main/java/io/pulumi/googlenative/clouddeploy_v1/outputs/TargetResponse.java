// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.clouddeploy_v1.outputs.AnthosClusterResponse;
import io.pulumi.googlenative.clouddeploy_v1.outputs.ExecutionConfigResponse;
import io.pulumi.googlenative.clouddeploy_v1.outputs.GkeClusterResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class TargetResponse {
    /**
     * Optional. User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    private final Map<String,String> annotations;
    /**
     * Information specifying an Anthos Cluster.
     * 
     */
    private final AnthosClusterResponse anthosCluster;
    /**
     * Time at which the `Target` was created.
     * 
     */
    private final String createTime;
    /**
     * Optional. Description of the `Target`. Max length is 255 characters.
     * 
     */
    private final String description;
    /**
     * Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    private final String etag;
    /**
     * Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
     * 
     */
    private final List<ExecutionConfigResponse> executionConfigs;
    /**
     * Information specifying a GKE Cluster.
     * 
     */
    private final GkeClusterResponse gke;
    /**
     * Optional. Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Optional. Name of the `Target`. Format is projects/{project}/locations/{location}/targets/a-z{0,62}.
     * 
     */
    private final String name;
    /**
     * Optional. Whether or not the `Target` requires approval.
     * 
     */
    private final Boolean requireApproval;
    /**
     * Resource id of the `Target`.
     * 
     */
    private final String targetId;
    /**
     * Unique identifier of the `Target`.
     * 
     */
    private final String uid;
    /**
     * Most recent time at which the `Target` was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private TargetResponse(
        @CustomType.Parameter("annotations") Map<String,String> annotations,
        @CustomType.Parameter("anthosCluster") AnthosClusterResponse anthosCluster,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("executionConfigs") List<ExecutionConfigResponse> executionConfigs,
        @CustomType.Parameter("gke") GkeClusterResponse gke,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("requireApproval") Boolean requireApproval,
        @CustomType.Parameter("targetId") String targetId,
        @CustomType.Parameter("uid") String uid,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.annotations = annotations;
        this.anthosCluster = anthosCluster;
        this.createTime = createTime;
        this.description = description;
        this.etag = etag;
        this.executionConfigs = executionConfigs;
        this.gke = gke;
        this.labels = labels;
        this.name = name;
        this.requireApproval = requireApproval;
        this.targetId = targetId;
        this.uid = uid;
        this.updateTime = updateTime;
    }

    /**
     * Optional. User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
    */
    public Map<String,String> getAnnotations() {
        return this.annotations;
    }
    /**
     * Information specifying an Anthos Cluster.
     * 
    */
    public AnthosClusterResponse getAnthosCluster() {
        return this.anthosCluster;
    }
    /**
     * Time at which the `Target` was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. Description of the `Target`. Max length is 255 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
     * 
    */
    public List<ExecutionConfigResponse> getExecutionConfigs() {
        return this.executionConfigs;
    }
    /**
     * Information specifying a GKE Cluster.
     * 
    */
    public GkeClusterResponse getGke() {
        return this.gke;
    }
    /**
     * Optional. Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Optional. Name of the `Target`. Format is projects/{project}/locations/{location}/targets/a-z{0,62}.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. Whether or not the `Target` requires approval.
     * 
    */
    public Boolean getRequireApproval() {
        return this.requireApproval;
    }
    /**
     * Resource id of the `Target`.
     * 
    */
    public String getTargetId() {
        return this.targetId;
    }
    /**
     * Unique identifier of the `Target`.
     * 
    */
    public String getUid() {
        return this.uid;
    }
    /**
     * Most recent time at which the `Target` was updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private AnthosClusterResponse anthosCluster;
        private String createTime;
        private String description;
        private String etag;
        private List<ExecutionConfigResponse> executionConfigs;
        private GkeClusterResponse gke;
        private Map<String,String> labels;
        private String name;
        private Boolean requireApproval;
        private String targetId;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.anthosCluster = defaults.anthosCluster;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.executionConfigs = defaults.executionConfigs;
    	      this.gke = defaults.gke;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.requireApproval = defaults.requireApproval;
    	      this.targetId = defaults.targetId;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }

        public Builder anthosCluster(AnthosClusterResponse anthosCluster) {
            this.anthosCluster = Objects.requireNonNull(anthosCluster);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder executionConfigs(List<ExecutionConfigResponse> executionConfigs) {
            this.executionConfigs = Objects.requireNonNull(executionConfigs);
            return this;
        }

        public Builder gke(GkeClusterResponse gke) {
            this.gke = Objects.requireNonNull(gke);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder requireApproval(Boolean requireApproval) {
            this.requireApproval = Objects.requireNonNull(requireApproval);
            return this;
        }

        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }

        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public TargetResponse build() {
            return new TargetResponse(annotations, anthosCluster, createTime, description, etag, executionConfigs, gke, labels, name, requireApproval, targetId, uid, updateTime);
        }
    }
}
