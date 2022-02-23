// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.inputs;

import io.pulumi.aws.gamelift.inputs.GameSessionQueuePlayerLatencyPolicyGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameSessionQueueState extends io.pulumi.resources.ResourceArgs {

    public static final GameSessionQueueState Empty = new GameSessionQueueState();

    /**
     * Game Session Queue ARN.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * List of fleet/alias ARNs used by session queue for placing game sessions.
     * 
     */
    @InputImport(name="destinations")
    private final @Nullable Input<List<String>> destinations;

    public Input<List<String>> getDestinations() {
        return this.destinations == null ? Input.empty() : this.destinations;
    }

    /**
     * Name of the session queue.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * One or more policies used to choose fleet based on player latency. See below.
     * 
     */
    @InputImport(name="playerLatencyPolicies")
    private final @Nullable Input<List<GameSessionQueuePlayerLatencyPolicyGetArgs>> playerLatencyPolicies;

    public Input<List<GameSessionQueuePlayerLatencyPolicyGetArgs>> getPlayerLatencyPolicies() {
        return this.playerLatencyPolicies == null ? Input.empty() : this.playerLatencyPolicies;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Maximum time a game session request can remain in the queue.
     * 
     */
    @InputImport(name="timeoutInSeconds")
    private final @Nullable Input<Integer> timeoutInSeconds;

    public Input<Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Input.empty() : this.timeoutInSeconds;
    }

    public GameSessionQueueState(
        @Nullable Input<String> arn,
        @Nullable Input<List<String>> destinations,
        @Nullable Input<String> name,
        @Nullable Input<List<GameSessionQueuePlayerLatencyPolicyGetArgs>> playerLatencyPolicies,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Integer> timeoutInSeconds) {
        this.arn = arn;
        this.destinations = destinations;
        this.name = name;
        this.playerLatencyPolicies = playerLatencyPolicies;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.timeoutInSeconds = timeoutInSeconds;
    }

    private GameSessionQueueState() {
        this.arn = Input.empty();
        this.destinations = Input.empty();
        this.name = Input.empty();
        this.playerLatencyPolicies = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.timeoutInSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameSessionQueueState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<String>> destinations;
        private @Nullable Input<String> name;
        private @Nullable Input<List<GameSessionQueuePlayerLatencyPolicyGetArgs>> playerLatencyPolicies;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Integer> timeoutInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GameSessionQueueState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.destinations = defaults.destinations;
    	      this.name = defaults.name;
    	      this.playerLatencyPolicies = defaults.playerLatencyPolicies;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDestinations(@Nullable Input<List<String>> destinations) {
            this.destinations = destinations;
            return this;
        }

        public Builder setDestinations(@Nullable List<String> destinations) {
            this.destinations = Input.ofNullable(destinations);
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

        public Builder setPlayerLatencyPolicies(@Nullable Input<List<GameSessionQueuePlayerLatencyPolicyGetArgs>> playerLatencyPolicies) {
            this.playerLatencyPolicies = playerLatencyPolicies;
            return this;
        }

        public Builder setPlayerLatencyPolicies(@Nullable List<GameSessionQueuePlayerLatencyPolicyGetArgs> playerLatencyPolicies) {
            this.playerLatencyPolicies = Input.ofNullable(playerLatencyPolicies);
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

        public Builder setTimeoutInSeconds(@Nullable Input<Integer> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = Input.ofNullable(timeoutInSeconds);
            return this;
        }
        public GameSessionQueueState build() {
            return new GameSessionQueueState(arn, destinations, name, playerLatencyPolicies, tags, tagsAll, timeoutInSeconds);
        }
    }
}