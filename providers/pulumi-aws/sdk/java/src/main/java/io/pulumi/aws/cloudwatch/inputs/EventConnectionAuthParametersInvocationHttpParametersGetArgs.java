// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersBodyGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersHeaderGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersQueryStringGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventConnectionAuthParametersInvocationHttpParametersGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventConnectionAuthParametersInvocationHttpParametersGetArgs Empty = new EventConnectionAuthParametersInvocationHttpParametersGetArgs();

    /**
     * Contains additional body string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @InputImport(name="bodies")
    private final @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersBodyGetArgs>> bodies;

    public Input<List<EventConnectionAuthParametersInvocationHttpParametersBodyGetArgs>> getBodies() {
        return this.bodies == null ? Input.empty() : this.bodies;
    }

    /**
     * Contains additional header parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @InputImport(name="headers")
    private final @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersHeaderGetArgs>> headers;

    public Input<List<EventConnectionAuthParametersInvocationHttpParametersHeaderGetArgs>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    /**
     * Contains additional query string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @InputImport(name="queryStrings")
    private final @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringGetArgs>> queryStrings;

    public Input<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringGetArgs>> getQueryStrings() {
        return this.queryStrings == null ? Input.empty() : this.queryStrings;
    }

    public EventConnectionAuthParametersInvocationHttpParametersGetArgs(
        @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersBodyGetArgs>> bodies,
        @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersHeaderGetArgs>> headers,
        @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringGetArgs>> queryStrings) {
        this.bodies = bodies;
        this.headers = headers;
        this.queryStrings = queryStrings;
    }

    private EventConnectionAuthParametersInvocationHttpParametersGetArgs() {
        this.bodies = Input.empty();
        this.headers = Input.empty();
        this.queryStrings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersInvocationHttpParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersBodyGetArgs>> bodies;
        private @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersHeaderGetArgs>> headers;
        private @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringGetArgs>> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersInvocationHttpParametersGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bodies = defaults.bodies;
    	      this.headers = defaults.headers;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder setBodies(@Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersBodyGetArgs>> bodies) {
            this.bodies = bodies;
            return this;
        }

        public Builder setBodies(@Nullable List<EventConnectionAuthParametersInvocationHttpParametersBodyGetArgs> bodies) {
            this.bodies = Input.ofNullable(bodies);
            return this;
        }

        public Builder setHeaders(@Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersHeaderGetArgs>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable List<EventConnectionAuthParametersInvocationHttpParametersHeaderGetArgs> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setQueryStrings(@Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringGetArgs>> queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }

        public Builder setQueryStrings(@Nullable List<EventConnectionAuthParametersInvocationHttpParametersQueryStringGetArgs> queryStrings) {
            this.queryStrings = Input.ofNullable(queryStrings);
            return this;
        }
        public EventConnectionAuthParametersInvocationHttpParametersGetArgs build() {
            return new EventConnectionAuthParametersInvocationHttpParametersGetArgs(bodies, headers, queryStrings);
        }
    }
}