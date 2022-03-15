// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A transformation object, containing all information associated with the named transformation. All transformations are contained under a streaming job.
 * 
 */
public final class TransformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransformationArgs Empty = new TransformationArgs();

    /**
     * Resource name
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specifies the query that will be run in the streaming job. You can learn more about the Stream Analytics Query Language (SAQL) here: https://msdn.microsoft.com/library/azure/dn834998 . Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="query")
      private final @Nullable Output<String> query;

    public Output<String> getQuery() {
        return this.query == null ? Output.empty() : this.query;
    }

    /**
     * Specifies the number of streaming units that the streaming job uses.
     * 
     */
    @Import(name="streamingUnits")
      private final @Nullable Output<Integer> streamingUnits;

    public Output<Integer> getStreamingUnits() {
        return this.streamingUnits == null ? Output.empty() : this.streamingUnits;
    }

    public TransformationArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> query,
        @Nullable Output<Integer> streamingUnits) {
        this.name = name;
        this.query = query;
        this.streamingUnits = streamingUnits;
    }

    private TransformationArgs() {
        this.name = Output.empty();
        this.query = Output.empty();
        this.streamingUnits = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> query;
        private @Nullable Output<Integer> streamingUnits;

        public Builder() {
    	      // Empty
        }

        public Builder(TransformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.query = defaults.query;
    	      this.streamingUnits = defaults.streamingUnits;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder query(@Nullable Output<String> query) {
            this.query = query;
            return this;
        }

        public Builder query(@Nullable String query) {
            this.query = Output.ofNullable(query);
            return this;
        }

        public Builder streamingUnits(@Nullable Output<Integer> streamingUnits) {
            this.streamingUnits = streamingUnits;
            return this;
        }

        public Builder streamingUnits(@Nullable Integer streamingUnits) {
            this.streamingUnits = Output.ofNullable(streamingUnits);
            return this;
        }
        public TransformationArgs build() {
            return new TransformationArgs(name, query, streamingUnits);
        }
    }
}
