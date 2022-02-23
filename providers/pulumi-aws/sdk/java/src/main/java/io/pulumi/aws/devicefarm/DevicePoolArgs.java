// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.devicefarm;

import io.pulumi.aws.devicefarm.inputs.DevicePoolRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DevicePoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final DevicePoolArgs Empty = new DevicePoolArgs();

    /**
     * The device pool's description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The number of devices that Device Farm can add to your device pool.
     * 
     */
    @InputImport(name="maxDevices")
    private final @Nullable Input<Integer> maxDevices;

    public Input<Integer> getMaxDevices() {
        return this.maxDevices == null ? Input.empty() : this.maxDevices;
    }

    /**
     * The name of the Device Pool
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ARN of the project for the device pool.
     * 
     */
    @InputImport(name="projectArn", required=true)
    private final Input<String> projectArn;

    public Input<String> getProjectArn() {
        return this.projectArn;
    }

    /**
     * The device pool's rules. See Rule.
     * 
     */
    @InputImport(name="rules", required=true)
    private final Input<List<DevicePoolRuleArgs>> rules;

    public Input<List<DevicePoolRuleArgs>> getRules() {
        return this.rules;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public DevicePoolArgs(
        @Nullable Input<String> description,
        @Nullable Input<Integer> maxDevices,
        @Nullable Input<String> name,
        Input<String> projectArn,
        Input<List<DevicePoolRuleArgs>> rules,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.description = description;
        this.maxDevices = maxDevices;
        this.name = name;
        this.projectArn = Objects.requireNonNull(projectArn, "expected parameter 'projectArn' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private DevicePoolArgs() {
        this.description = Input.empty();
        this.maxDevices = Input.empty();
        this.name = Input.empty();
        this.projectArn = Input.empty();
        this.rules = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Integer> maxDevices;
        private @Nullable Input<String> name;
        private Input<String> projectArn;
        private Input<List<DevicePoolRuleArgs>> rules;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.maxDevices = defaults.maxDevices;
    	      this.name = defaults.name;
    	      this.projectArn = defaults.projectArn;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setMaxDevices(@Nullable Input<Integer> maxDevices) {
            this.maxDevices = maxDevices;
            return this;
        }

        public Builder setMaxDevices(@Nullable Integer maxDevices) {
            this.maxDevices = Input.ofNullable(maxDevices);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProjectArn(Input<String> projectArn) {
            this.projectArn = Objects.requireNonNull(projectArn);
            return this;
        }

        public Builder setProjectArn(String projectArn) {
            this.projectArn = Input.of(Objects.requireNonNull(projectArn));
            return this;
        }

        public Builder setRules(Input<List<DevicePoolRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setRules(List<DevicePoolRuleArgs> rules) {
            this.rules = Input.of(Objects.requireNonNull(rules));
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

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public DevicePoolArgs build() {
            return new DevicePoolArgs(description, maxDevices, name, projectArn, rules, tags, tagsAll);
        }
    }
}
