// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A complex type that contains an optional comment.
 * 
 * If you don't want to specify a comment, omit the HostedZoneConfig and Comment elements.
 * 
 */
public final class HostedZoneConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostedZoneConfigArgs Empty = new HostedZoneConfigArgs();

    /**
     * Any comments that you want to include about the hosted zone.
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> getComment() {
        return this.comment == null ? Output.empty() : this.comment;
    }

    public HostedZoneConfigArgs(@Nullable Output<String> comment) {
        this.comment = comment;
    }

    private HostedZoneConfigArgs() {
        this.comment = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedZoneConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comment;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedZoneConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
        }

        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = Output.ofNullable(comment);
            return this;
        }
        public HostedZoneConfigArgs build() {
            return new HostedZoneConfigArgs(comment);
        }
    }
}
