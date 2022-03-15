// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amp.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupNamespaceState extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupNamespaceState Empty = new RuleGroupNamespaceState();

    /**
     * the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
     * 
     */
    @Import(name="data")
      private final @Nullable Output<String> data;

    public Output<String> getData() {
        return this.data == null ? Output.empty() : this.data;
    }

    /**
     * The name of the rule group namespace
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The id of the prometheus workspace the rule group namespace should be linked to
     * 
     */
    @Import(name="workspaceId")
      private final @Nullable Output<String> workspaceId;

    public Output<String> getWorkspaceId() {
        return this.workspaceId == null ? Output.empty() : this.workspaceId;
    }

    public RuleGroupNamespaceState(
        @Nullable Output<String> data,
        @Nullable Output<String> name,
        @Nullable Output<String> workspaceId) {
        this.data = data;
        this.name = name;
        this.workspaceId = workspaceId;
    }

    private RuleGroupNamespaceState() {
        this.data = Output.empty();
        this.name = Output.empty();
        this.workspaceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupNamespaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> data;
        private @Nullable Output<String> name;
        private @Nullable Output<String> workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupNamespaceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.name = defaults.name;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder data(@Nullable Output<String> data) {
            this.data = data;
            return this;
        }

        public Builder data(@Nullable String data) {
            this.data = Output.ofNullable(data);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Builder workspaceId(@Nullable String workspaceId) {
            this.workspaceId = Output.ofNullable(workspaceId);
            return this;
        }
        public RuleGroupNamespaceState build() {
            return new RuleGroupNamespaceState(data, name, workspaceId);
        }
    }
}
