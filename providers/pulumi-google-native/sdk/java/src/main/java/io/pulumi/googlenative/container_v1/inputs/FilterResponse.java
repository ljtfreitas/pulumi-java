// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Allows filtering to one or more specific event types. If event types are present, those and only those event types will be transmitted to the cluster. Other types will be skipped. If no filter is specified, or no event types are present, all event types will be sent
 * 
 */
public final class FilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final FilterResponse Empty = new FilterResponse();

    /**
     * Event types to allowlist.
     * 
     */
    @Import(name="eventType", required=true)
      private final List<String> eventType;

    public List<String> getEventType() {
        return this.eventType;
    }

    public FilterResponse(List<String> eventType) {
        this.eventType = Objects.requireNonNull(eventType, "expected parameter 'eventType' to be non-null");
    }

    private FilterResponse() {
        this.eventType = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> eventType;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
        }

        public Builder eventType(List<String> eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }
        public FilterResponse build() {
            return new FilterResponse(eventType);
        }
    }
}
