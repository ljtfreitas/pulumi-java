// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshPreferencesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupInstanceRefreshArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupInstanceRefreshArgs Empty = new GroupInstanceRefreshArgs();

    /**
     * Override default parameters for Instance Refresh.
     * 
     */
    @InputImport(name="preferences")
    private final @Nullable Input<GroupInstanceRefreshPreferencesArgs> preferences;

    public Input<GroupInstanceRefreshPreferencesArgs> getPreferences() {
        return this.preferences == null ? Input.empty() : this.preferences;
    }

    /**
     * The strategy to use for instance refresh. The only allowed value is `Rolling`. See [StartInstanceRefresh Action](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_StartInstanceRefresh.html#API_StartInstanceRefresh_RequestParameters) for more information.
     * 
     */
    @InputImport(name="strategy", required=true)
    private final Input<String> strategy;

    public Input<String> getStrategy() {
        return this.strategy;
    }

    /**
     * Set of additional property names that will trigger an Instance Refresh. A refresh will always be triggered by a change in any of `launch_configuration`, `launch_template`, or `mixed_instances_policy`.
     * 
     */
    @InputImport(name="triggers")
    private final @Nullable Input<List<String>> triggers;

    public Input<List<String>> getTriggers() {
        return this.triggers == null ? Input.empty() : this.triggers;
    }

    public GroupInstanceRefreshArgs(
        @Nullable Input<GroupInstanceRefreshPreferencesArgs> preferences,
        Input<String> strategy,
        @Nullable Input<List<String>> triggers) {
        this.preferences = preferences;
        this.strategy = Objects.requireNonNull(strategy, "expected parameter 'strategy' to be non-null");
        this.triggers = triggers;
    }

    private GroupInstanceRefreshArgs() {
        this.preferences = Input.empty();
        this.strategy = Input.empty();
        this.triggers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupInstanceRefreshArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GroupInstanceRefreshPreferencesArgs> preferences;
        private Input<String> strategy;
        private @Nullable Input<List<String>> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupInstanceRefreshArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferences = defaults.preferences;
    	      this.strategy = defaults.strategy;
    	      this.triggers = defaults.triggers;
        }

        public Builder setPreferences(@Nullable Input<GroupInstanceRefreshPreferencesArgs> preferences) {
            this.preferences = preferences;
            return this;
        }

        public Builder setPreferences(@Nullable GroupInstanceRefreshPreferencesArgs preferences) {
            this.preferences = Input.ofNullable(preferences);
            return this;
        }

        public Builder setStrategy(Input<String> strategy) {
            this.strategy = Objects.requireNonNull(strategy);
            return this;
        }

        public Builder setStrategy(String strategy) {
            this.strategy = Input.of(Objects.requireNonNull(strategy));
            return this;
        }

        public Builder setTriggers(@Nullable Input<List<String>> triggers) {
            this.triggers = triggers;
            return this;
        }

        public Builder setTriggers(@Nullable List<String> triggers) {
            this.triggers = Input.ofNullable(triggers);
            return this;
        }
        public GroupInstanceRefreshArgs build() {
            return new GroupInstanceRefreshArgs(preferences, strategy, triggers);
        }
    }
}
