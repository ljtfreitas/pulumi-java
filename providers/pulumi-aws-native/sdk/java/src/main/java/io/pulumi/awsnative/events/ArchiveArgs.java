// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ArchiveArgs extends io.pulumi.resources.ResourceArgs {

    public static final ArchiveArgs Empty = new ArchiveArgs();

    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="eventPattern")
        private final @Nullable Input<Object> eventPattern;

    public Input<Object> getEventPattern() {
        return this.eventPattern == null ? Input.empty() : this.eventPattern;
    }

    @InputImport(name="retentionDays")
        private final @Nullable Input<Integer> retentionDays;

    public Input<Integer> getRetentionDays() {
        return this.retentionDays == null ? Input.empty() : this.retentionDays;
    }

    @InputImport(name="sourceArn", required=true)
        private final Input<String> sourceArn;

    public Input<String> getSourceArn() {
        return this.sourceArn;
    }

    public ArchiveArgs(
        @Nullable Input<String> description,
        @Nullable Input<Object> eventPattern,
        @Nullable Input<Integer> retentionDays,
        Input<String> sourceArn) {
        this.description = description;
        this.eventPattern = eventPattern;
        this.retentionDays = retentionDays;
        this.sourceArn = Objects.requireNonNull(sourceArn, "expected parameter 'sourceArn' to be non-null");
    }

    private ArchiveArgs() {
        this.description = Input.empty();
        this.eventPattern = Input.empty();
        this.retentionDays = Input.empty();
        this.sourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArchiveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Object> eventPattern;
        private @Nullable Input<Integer> retentionDays;
        private Input<String> sourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ArchiveArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.eventPattern = defaults.eventPattern;
    	      this.retentionDays = defaults.retentionDays;
    	      this.sourceArn = defaults.sourceArn;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEventPattern(@Nullable Input<Object> eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }

        public Builder setEventPattern(@Nullable Object eventPattern) {
            this.eventPattern = Input.ofNullable(eventPattern);
            return this;
        }

        public Builder setRetentionDays(@Nullable Input<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder setRetentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Input.ofNullable(retentionDays);
            return this;
        }

        public Builder setSourceArn(Input<String> sourceArn) {
            this.sourceArn = Objects.requireNonNull(sourceArn);
            return this;
        }

        public Builder setSourceArn(String sourceArn) {
            this.sourceArn = Input.of(Objects.requireNonNull(sourceArn));
            return this;
        }
        public ArchiveArgs build() {
            return new ArchiveArgs(description, eventPattern, retentionDays, sourceArn);
        }
    }
}
