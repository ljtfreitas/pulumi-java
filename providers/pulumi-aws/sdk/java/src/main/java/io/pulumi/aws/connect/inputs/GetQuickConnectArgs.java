// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQuickConnectArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetQuickConnectArgs Empty = new GetQuickConnectArgs();

    /**
     * Reference to the hosting Amazon Connect Instance
     * 
     */
    @Import(name="instanceId", required=true)
      private final String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * Returns information on a specific Quick Connect by name
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Returns information on a specific Quick Connect by Quick Connect id
     * 
     */
    @Import(name="quickConnectId")
      private final @Nullable String quickConnectId;

    public Optional<String> getQuickConnectId() {
        return this.quickConnectId == null ? Optional.empty() : Optional.ofNullable(this.quickConnectId);
    }

    /**
     * A map of tags to assign to the Quick Connect.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetQuickConnectArgs(
        String instanceId,
        @Nullable String name,
        @Nullable String quickConnectId,
        @Nullable Map<String,String> tags) {
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.name = name;
        this.quickConnectId = quickConnectId;
        this.tags = tags;
    }

    private GetQuickConnectArgs() {
        this.instanceId = null;
        this.name = null;
        this.quickConnectId = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuickConnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceId;
        private @Nullable String name;
        private @Nullable String quickConnectId;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQuickConnectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.quickConnectId = defaults.quickConnectId;
    	      this.tags = defaults.tags;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder quickConnectId(@Nullable String quickConnectId) {
            this.quickConnectId = quickConnectId;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetQuickConnectArgs build() {
            return new GetQuickConnectArgs(instanceId, name, quickConnectId, tags);
        }
    }
}
