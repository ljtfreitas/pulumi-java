// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersBodyArgs;
import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersHeaderArgs;
import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventConnectionAuthParametersInvocationHttpParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventConnectionAuthParametersInvocationHttpParametersArgs Empty = new EventConnectionAuthParametersInvocationHttpParametersArgs();

    /**
     * Contains additional body string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @InputImport(name="bodies")
    private final @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersBodyArgs>> bodies;

    public Input<List<EventConnectionAuthParametersInvocationHttpParametersBodyArgs>> getBodies() {
        return this.bodies == null ? Input.empty() : this.bodies;
    }

    /**
     * Contains additional header parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @InputImport(name="headers")
    private final @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersHeaderArgs>> headers;

    public Input<List<EventConnectionAuthParametersInvocationHttpParametersHeaderArgs>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    /**
     * Contains additional query string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @InputImport(name="queryStrings")
    private final @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs>> queryStrings;

    public Input<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs>> getQueryStrings() {
        return this.queryStrings == null ? Input.empty() : this.queryStrings;
    }

    public EventConnectionAuthParametersInvocationHttpParametersArgs(
        @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersBodyArgs>> bodies,
        @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersHeaderArgs>> headers,
        @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs>> queryStrings) {
        this.bodies = bodies;
        this.headers = headers;
        this.queryStrings = queryStrings;
    }

    private EventConnectionAuthParametersInvocationHttpParametersArgs() {
        this.bodies = Input.empty();
        this.headers = Input.empty();
        this.queryStrings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersInvocationHttpParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersBodyArgs>> bodies;
        private @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersHeaderArgs>> headers;
        private @Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs>> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersInvocationHttpParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bodies = defaults.bodies;
    	      this.headers = defaults.headers;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder setBodies(@Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersBodyArgs>> bodies) {
            this.bodies = bodies;
            return this;
        }

        public Builder setBodies(@Nullable List<EventConnectionAuthParametersInvocationHttpParametersBodyArgs> bodies) {
            this.bodies = Input.ofNullable(bodies);
            return this;
        }

        public Builder setHeaders(@Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersHeaderArgs>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable List<EventConnectionAuthParametersInvocationHttpParametersHeaderArgs> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setQueryStrings(@Nullable Input<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs>> queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }

        public Builder setQueryStrings(@Nullable List<EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs> queryStrings) {
            this.queryStrings = Input.ofNullable(queryStrings);
            return this;
        }
        public EventConnectionAuthParametersInvocationHttpParametersArgs build() {
            return new EventConnectionAuthParametersInvocationHttpParametersArgs(bodies, headers, queryStrings);
        }
    }
}
