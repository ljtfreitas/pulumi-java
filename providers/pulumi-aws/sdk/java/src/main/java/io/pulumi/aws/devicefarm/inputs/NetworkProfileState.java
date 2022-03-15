// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.devicefarm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkProfileState extends io.pulumi.resources.ResourceArgs {

    public static final NetworkProfileState Empty = new NetworkProfileState();

    /**
     * The Amazon Resource Name of this network profile.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The description of the network profile.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    @Import(name="downlinkBandwidthBits")
      private final @Nullable Output<Integer> downlinkBandwidthBits;

    public Output<Integer> getDownlinkBandwidthBits() {
        return this.downlinkBandwidthBits == null ? Output.empty() : this.downlinkBandwidthBits;
    }

    /**
     * Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @Import(name="downlinkDelayMs")
      private final @Nullable Output<Integer> downlinkDelayMs;

    public Output<Integer> getDownlinkDelayMs() {
        return this.downlinkDelayMs == null ? Output.empty() : this.downlinkDelayMs;
    }

    /**
     * Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @Import(name="downlinkJitterMs")
      private final @Nullable Output<Integer> downlinkJitterMs;

    public Output<Integer> getDownlinkJitterMs() {
        return this.downlinkJitterMs == null ? Output.empty() : this.downlinkJitterMs;
    }

    /**
     * Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    @Import(name="downlinkLossPercent")
      private final @Nullable Output<Integer> downlinkLossPercent;

    public Output<Integer> getDownlinkLossPercent() {
        return this.downlinkLossPercent == null ? Output.empty() : this.downlinkLossPercent;
    }

    /**
     * The name for the network profile.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ARN of the project for the network profile.
     * 
     */
    @Import(name="projectArn")
      private final @Nullable Output<String> projectArn;

    public Output<String> getProjectArn() {
        return this.projectArn == null ? Output.empty() : this.projectArn;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    @Import(name="uplinkBandwidthBits")
      private final @Nullable Output<Integer> uplinkBandwidthBits;

    public Output<Integer> getUplinkBandwidthBits() {
        return this.uplinkBandwidthBits == null ? Output.empty() : this.uplinkBandwidthBits;
    }

    /**
     * Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @Import(name="uplinkDelayMs")
      private final @Nullable Output<Integer> uplinkDelayMs;

    public Output<Integer> getUplinkDelayMs() {
        return this.uplinkDelayMs == null ? Output.empty() : this.uplinkDelayMs;
    }

    /**
     * Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @Import(name="uplinkJitterMs")
      private final @Nullable Output<Integer> uplinkJitterMs;

    public Output<Integer> getUplinkJitterMs() {
        return this.uplinkJitterMs == null ? Output.empty() : this.uplinkJitterMs;
    }

    /**
     * Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    @Import(name="uplinkLossPercent")
      private final @Nullable Output<Integer> uplinkLossPercent;

    public Output<Integer> getUplinkLossPercent() {
        return this.uplinkLossPercent == null ? Output.empty() : this.uplinkLossPercent;
    }

    public NetworkProfileState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<Integer> downlinkBandwidthBits,
        @Nullable Output<Integer> downlinkDelayMs,
        @Nullable Output<Integer> downlinkJitterMs,
        @Nullable Output<Integer> downlinkLossPercent,
        @Nullable Output<String> name,
        @Nullable Output<String> projectArn,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> type,
        @Nullable Output<Integer> uplinkBandwidthBits,
        @Nullable Output<Integer> uplinkDelayMs,
        @Nullable Output<Integer> uplinkJitterMs,
        @Nullable Output<Integer> uplinkLossPercent) {
        this.arn = arn;
        this.description = description;
        this.downlinkBandwidthBits = downlinkBandwidthBits;
        this.downlinkDelayMs = downlinkDelayMs;
        this.downlinkJitterMs = downlinkJitterMs;
        this.downlinkLossPercent = downlinkLossPercent;
        this.name = name;
        this.projectArn = projectArn;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
        this.uplinkBandwidthBits = uplinkBandwidthBits;
        this.uplinkDelayMs = uplinkDelayMs;
        this.uplinkJitterMs = uplinkJitterMs;
        this.uplinkLossPercent = uplinkLossPercent;
    }

    private NetworkProfileState() {
        this.arn = Output.empty();
        this.description = Output.empty();
        this.downlinkBandwidthBits = Output.empty();
        this.downlinkDelayMs = Output.empty();
        this.downlinkJitterMs = Output.empty();
        this.downlinkLossPercent = Output.empty();
        this.name = Output.empty();
        this.projectArn = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.type = Output.empty();
        this.uplinkBandwidthBits = Output.empty();
        this.uplinkDelayMs = Output.empty();
        this.uplinkJitterMs = Output.empty();
        this.uplinkLossPercent = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> downlinkBandwidthBits;
        private @Nullable Output<Integer> downlinkDelayMs;
        private @Nullable Output<Integer> downlinkJitterMs;
        private @Nullable Output<Integer> downlinkLossPercent;
        private @Nullable Output<String> name;
        private @Nullable Output<String> projectArn;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> type;
        private @Nullable Output<Integer> uplinkBandwidthBits;
        private @Nullable Output<Integer> uplinkDelayMs;
        private @Nullable Output<Integer> uplinkJitterMs;
        private @Nullable Output<Integer> uplinkLossPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.downlinkBandwidthBits = defaults.downlinkBandwidthBits;
    	      this.downlinkDelayMs = defaults.downlinkDelayMs;
    	      this.downlinkJitterMs = defaults.downlinkJitterMs;
    	      this.downlinkLossPercent = defaults.downlinkLossPercent;
    	      this.name = defaults.name;
    	      this.projectArn = defaults.projectArn;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
    	      this.uplinkBandwidthBits = defaults.uplinkBandwidthBits;
    	      this.uplinkDelayMs = defaults.uplinkDelayMs;
    	      this.uplinkJitterMs = defaults.uplinkJitterMs;
    	      this.uplinkLossPercent = defaults.uplinkLossPercent;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder downlinkBandwidthBits(@Nullable Output<Integer> downlinkBandwidthBits) {
            this.downlinkBandwidthBits = downlinkBandwidthBits;
            return this;
        }

        public Builder downlinkBandwidthBits(@Nullable Integer downlinkBandwidthBits) {
            this.downlinkBandwidthBits = Output.ofNullable(downlinkBandwidthBits);
            return this;
        }

        public Builder downlinkDelayMs(@Nullable Output<Integer> downlinkDelayMs) {
            this.downlinkDelayMs = downlinkDelayMs;
            return this;
        }

        public Builder downlinkDelayMs(@Nullable Integer downlinkDelayMs) {
            this.downlinkDelayMs = Output.ofNullable(downlinkDelayMs);
            return this;
        }

        public Builder downlinkJitterMs(@Nullable Output<Integer> downlinkJitterMs) {
            this.downlinkJitterMs = downlinkJitterMs;
            return this;
        }

        public Builder downlinkJitterMs(@Nullable Integer downlinkJitterMs) {
            this.downlinkJitterMs = Output.ofNullable(downlinkJitterMs);
            return this;
        }

        public Builder downlinkLossPercent(@Nullable Output<Integer> downlinkLossPercent) {
            this.downlinkLossPercent = downlinkLossPercent;
            return this;
        }

        public Builder downlinkLossPercent(@Nullable Integer downlinkLossPercent) {
            this.downlinkLossPercent = Output.ofNullable(downlinkLossPercent);
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

        public Builder projectArn(@Nullable Output<String> projectArn) {
            this.projectArn = projectArn;
            return this;
        }

        public Builder projectArn(@Nullable String projectArn) {
            this.projectArn = Output.ofNullable(projectArn);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }

        public Builder uplinkBandwidthBits(@Nullable Output<Integer> uplinkBandwidthBits) {
            this.uplinkBandwidthBits = uplinkBandwidthBits;
            return this;
        }

        public Builder uplinkBandwidthBits(@Nullable Integer uplinkBandwidthBits) {
            this.uplinkBandwidthBits = Output.ofNullable(uplinkBandwidthBits);
            return this;
        }

        public Builder uplinkDelayMs(@Nullable Output<Integer> uplinkDelayMs) {
            this.uplinkDelayMs = uplinkDelayMs;
            return this;
        }

        public Builder uplinkDelayMs(@Nullable Integer uplinkDelayMs) {
            this.uplinkDelayMs = Output.ofNullable(uplinkDelayMs);
            return this;
        }

        public Builder uplinkJitterMs(@Nullable Output<Integer> uplinkJitterMs) {
            this.uplinkJitterMs = uplinkJitterMs;
            return this;
        }

        public Builder uplinkJitterMs(@Nullable Integer uplinkJitterMs) {
            this.uplinkJitterMs = Output.ofNullable(uplinkJitterMs);
            return this;
        }

        public Builder uplinkLossPercent(@Nullable Output<Integer> uplinkLossPercent) {
            this.uplinkLossPercent = uplinkLossPercent;
            return this;
        }

        public Builder uplinkLossPercent(@Nullable Integer uplinkLossPercent) {
            this.uplinkLossPercent = Output.ofNullable(uplinkLossPercent);
            return this;
        }
        public NetworkProfileState build() {
            return new NetworkProfileState(arn, description, downlinkBandwidthBits, downlinkDelayMs, downlinkJitterMs, downlinkLossPercent, name, projectArn, tags, tagsAll, type, uplinkBandwidthBits, uplinkDelayMs, uplinkJitterMs, uplinkLossPercent);
        }
    }
}
