// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersBodyArgs;
import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersHeaderArgs;
import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventConnectionAuthParametersInvocationHttpParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventConnectionAuthParametersInvocationHttpParametersArgs Empty = new EventConnectionAuthParametersInvocationHttpParametersArgs();

    /**
     * Contains additional body string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @Import(name="bodies")
      private final @Nullable Output<List<EventConnectionAuthParametersInvocationHttpParametersBodyArgs>> bodies;

    public Output<List<EventConnectionAuthParametersInvocationHttpParametersBodyArgs>> getBodies() {
        return this.bodies == null ? Output.empty() : this.bodies;
    }

    /**
     * Contains additional header parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<List<EventConnectionAuthParametersInvocationHttpParametersHeaderArgs>> headers;

    public Output<List<EventConnectionAuthParametersInvocationHttpParametersHeaderArgs>> getHeaders() {
        return this.headers == null ? Output.empty() : this.headers;
    }

    /**
     * Contains additional query string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @Import(name="queryStrings")
      private final @Nullable Output<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs>> queryStrings;

    public Output<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs>> getQueryStrings() {
        return this.queryStrings == null ? Output.empty() : this.queryStrings;
    }

    public EventConnectionAuthParametersInvocationHttpParametersArgs(
        @Nullable Output<List<EventConnectionAuthParametersInvocationHttpParametersBodyArgs>> bodies,
        @Nullable Output<List<EventConnectionAuthParametersInvocationHttpParametersHeaderArgs>> headers,
        @Nullable Output<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs>> queryStrings) {
        this.bodies = bodies;
        this.headers = headers;
        this.queryStrings = queryStrings;
    }

    private EventConnectionAuthParametersInvocationHttpParametersArgs() {
        this.bodies = Output.empty();
        this.headers = Output.empty();
        this.queryStrings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersInvocationHttpParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<EventConnectionAuthParametersInvocationHttpParametersBodyArgs>> bodies;
        private @Nullable Output<List<EventConnectionAuthParametersInvocationHttpParametersHeaderArgs>> headers;
        private @Nullable Output<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs>> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersInvocationHttpParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bodies = defaults.bodies;
    	      this.headers = defaults.headers;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder bodies(@Nullable Output<List<EventConnectionAuthParametersInvocationHttpParametersBodyArgs>> bodies) {
            this.bodies = bodies;
            return this;
        }

        public Builder bodies(@Nullable List<EventConnectionAuthParametersInvocationHttpParametersBodyArgs> bodies) {
            this.bodies = Output.ofNullable(bodies);
            return this;
        }

        public Builder headers(@Nullable Output<List<EventConnectionAuthParametersInvocationHttpParametersHeaderArgs>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder headers(@Nullable List<EventConnectionAuthParametersInvocationHttpParametersHeaderArgs> headers) {
            this.headers = Output.ofNullable(headers);
            return this;
        }

        public Builder queryStrings(@Nullable Output<List<EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs>> queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }

        public Builder queryStrings(@Nullable List<EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs> queryStrings) {
            this.queryStrings = Output.ofNullable(queryStrings);
            return this;
        }
        public EventConnectionAuthParametersInvocationHttpParametersArgs build() {
            return new EventConnectionAuthParametersInvocationHttpParametersArgs(bodies, headers, queryStrings);
        }
    }
}
