// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.container_v1.enums.FilterEventTypeItem;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Allows filtering to one or more specific event types. If event types are present, those and only those event types will be transmitted to the cluster. Other types will be skipped. If no filter is specified, or no event types are present, all event types will be sent
 * 
 */
public final class FilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterArgs Empty = new FilterArgs();

    /**
     * Event types to allowlist.
     * 
     */
    @Import(name="eventType")
      private final @Nullable Output<List<FilterEventTypeItem>> eventType;

    public Output<List<FilterEventTypeItem>> getEventType() {
        return this.eventType == null ? Output.empty() : this.eventType;
    }

    public FilterArgs(@Nullable Output<List<FilterEventTypeItem>> eventType) {
        this.eventType = eventType;
    }

    private FilterArgs() {
        this.eventType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FilterEventTypeItem>> eventType;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
        }

        public Builder eventType(@Nullable Output<List<FilterEventTypeItem>> eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder eventType(@Nullable List<FilterEventTypeItem> eventType) {
            this.eventType = Output.ofNullable(eventType);
            return this;
        }
        public FilterArgs build() {
            return new FilterArgs(eventType);
        }
    }
}
